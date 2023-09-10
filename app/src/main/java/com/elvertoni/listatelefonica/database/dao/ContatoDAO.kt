package com.elvertoni.listatelefonica.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.elvertoni.listatelefonica.model.Contato

@Dao
interface ContatoDAO {
    @Insert
    fun insert(contato: Contato):Long
    @Update
    fun update(contato: Contato):Int
    @Delete
    fun delete(contato: Contato):Int
    @Query("SELECT * FROM Contato")
    fun selectAll(): List<Contato>
    @Query("SELECT * FROM Contato WHERE id=:id")
    fun select(id: Int): Contato

}