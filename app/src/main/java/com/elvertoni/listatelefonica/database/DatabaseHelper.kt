package com.elvertoni.listatelefonica.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.elvertoni.listatelefonica.database.dao.ContatoDAO
import com.elvertoni.listatelefonica.model.Contato

@Database(entities = [Contato::class], version = 1)
abstract class DatabaseHelper : RoomDatabase() {
    abstract fun contatoDAO(): ContatoDAO

    companion object{
        private lateinit var INSTANCE: DatabaseHelper
        fun getDatabase(context: Context): DatabaseHelper {
            if (!Companion::INSTANCE.isInitialized){
                synchronized(DatabaseHelper::class.java){
                    INSTANCE = Room.databaseBuilder(context, DatabaseHelper::class.java, "database")
                        .allowMainThreadQueries()
                        .build()
                }
            }
            return INSTANCE
        }
    }
}