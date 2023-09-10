package com.elvertoni.listatelefonica.adapter.listener

import com.elvertoni.listatelefonica.model.Contato

class ContatoOnClickListener(val clickListener: (contato: Contato) -> Unit) {
    fun onClick(contato: Contato) = clickListener
}