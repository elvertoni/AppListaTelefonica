package com.elvertoni.listatelefonica.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.elvertoni.listatelefonica.database.ContatoRepository
import com.elvertoni.listatelefonica.model.Contato

class DetalheContatoViewModel(application: Application) : AndroidViewModel(application) {
    private var contato = MutableLiveData<Contato>()
    private var update = MutableLiveData<String>()
    private var delete = MutableLiveData<String>()
    private var contatoRepository = ContatoRepository(application.applicationContext)

    fun contato(): LiveData<Contato> {
        return contato
    }

    fun update(): LiveData<String> {
        return update
    }

    fun delete(): LiveData<String> {
        return delete
    }

    fun getContato(id: Int) {
        contato.value = contatoRepository.select(id)
    }

    fun update(contato: Contato) {
        if (contatoRepository.update(contato) > 0) {
            update.value = "Update OK"
        } else {
            update.value = "Erro no Update"
        }
    }

    fun delete(contato: Contato) {
        if (contatoRepository.delete(contato) > 0) {
            delete.value = "Delete OK"
        } else {
            delete.value = "Erro no Delete"
        }
    }

}