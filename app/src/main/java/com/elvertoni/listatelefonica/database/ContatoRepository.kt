package com.elvertoni.listatelefonica.database

import android.content.Context
import com.elvertoni.listatelefonica.model.Contato

class ContatoRepository(context: Context) {

    private val databaseHelper = DatabaseHelper.getDatabase(context).contatoDAO()
    fun insert(contato: Contato): Long{
        return databaseHelper.insert(contato)
    }
    fun update(contato: Contato): Int{
        return databaseHelper.update(contato)
    }
    fun delete(contato: Contato): Int{
        return databaseHelper.delete(contato)
    }
    fun selectAll(): List<Contato>{
        return databaseHelper.selectAll()
    }
    fun select(id: Int): Contato{
        return databaseHelper.select(id)
    }

}