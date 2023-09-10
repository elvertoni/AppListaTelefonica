package com.elvertoni.listatelefonica.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.result.ActivityResultLauncher
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.elvertoni.listatelefonica.adapter.ContatoListAdapter
import com.elvertoni.listatelefonica.databinding.ActivityMainBinding
import com.elvertoni.listatelefonica.model.Contato
import com.elvertoni.listatelefonica.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    private lateinit var launcher: ActivityResultLauncher<Intent>
    private lateinit var adapter: ContatoListAdapter
    private var listaContato: List<Contato> = listOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        binding.recyclerViewContatos.layoutManager = LinearLayoutManager(this)
    }
}