package com.elvertoni.listatelefonica.model

data class Contato(
    val id: Int = 0,
    val nome: String = "",
    val endereco: String = "",
    val telefone: String = "",
    val email: String = "",
    val imagemId: Int = 0
)
