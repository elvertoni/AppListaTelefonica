package com.elvertoni.listatelefonica.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.elvertoni.listatelefonica.R
import com.elvertoni.listatelefonica.adapter.listener.ContatoOnClickListener
import com.elvertoni.listatelefonica.adapter.viewholder.ContatoViewHolder
import com.elvertoni.listatelefonica.model.Contato

class ContatoListAdapter(
    private val contatoList: List<Contato>,
    private val contatoOnClickListener: ContatoOnClickListener
) : RecyclerView.Adapter<ContatoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContatoViewHolder {
        return ContatoViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.row_contato, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return contatoList.size
    }

    override fun onBindViewHolder(holder: ContatoViewHolder, position: Int) {
        val contato = contatoList[position]
        holder.textNome.text = contato.nome
        if (contato.imagemId>0){
            holder.imagem.setImageResource(contato.imagemId)
        }else {
            holder.imagem.setImageResource(R.drawable.profiledefault)
        }
        holder.itemView.setOnClickListener{
            contatoOnClickListener.clickListener(contato)
        }
    }

}