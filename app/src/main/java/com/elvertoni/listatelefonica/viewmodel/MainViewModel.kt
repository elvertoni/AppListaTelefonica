package com.elvertoni.listatelefonica.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.elvertoni.listatelefonica.database.ContatoRepository
import com.elvertoni.listatelefonica.model.Contato

class MainViewModel(application: Application): AndroidViewModel(application) {
    private val listaContato: MutableLiveData<List<Contato>> = MutableLiveData(listOf())
    private val contatoRepository = ContatoRepository(application.applicationContext)

    fun listaContato
}