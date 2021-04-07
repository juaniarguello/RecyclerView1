package com.recyclerview.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.recyclerview.R
import com.recyclerview.entities.Pelicula

class PeliculaAdapter(private var peliculasList: MutableList<Pelicula>): RecyclerView.Adapter<PeliculaAdapter.PeliculaHolder>() {


    class PeliculaHolder(v: View) : RecyclerView.ViewHolder(v){
        //HOLDER REPRESENTA UNA VISTA, POR ESO RECIBE UNA VIEW
        private var view: View
        init {
            this.view = v
        }
        fun setName(name: String){
            val txt: TextView = view.findViewById(R.id.txt_name_item)
            txt.text = name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeliculaHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_pelicula, parent, false)
        return(PeliculaAdapter.PeliculaHolder(view))
    }

    override fun getItemCount(): Int {
        return peliculasList.size
    }

    override fun onBindViewHolder(holder: PeliculaHolder, position: Int) {
        holder.setName(peliculasList[position].nombre)
    }
}