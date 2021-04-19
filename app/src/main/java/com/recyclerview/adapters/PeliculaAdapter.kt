package com.recyclerview.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.recyclerview.R
import com.recyclerview.entities.Pelicula

class PeliculaAdapter(private var peliculasList: MutableList<Pelicula>
        //, val onItemClick: (Int) -> Boolean
    )
    : RecyclerView.Adapter<PeliculaAdapter.PeliculaHolder>() {

    companion object {
        private val TAG = "PeliculaAdapter"
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeliculaHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_pelicula, parent, false)
        return (PeliculaHolder(view))
    }

    override fun getItemCount(): Int {
        return peliculasList.size
    }

    override fun onBindViewHolder(holder: PeliculaHolder, position: Int) {
        holder.setName(peliculasList[position].nombre)
        holder.setAnio(peliculasList[position].anio)
    }

    fun setData(newData: ArrayList<Pelicula>) {
        this.peliculasList = newData
        this.notifyDataSetChanged()
    }

    // -------------------- Clase Pelicula Holder --------------------  //
    class PeliculaHolder(v: View) : RecyclerView.ViewHolder(v) {
        //HOLDER REPRESENTA UNA VISTA, POR ESO RECIBE UNA VIEW
        private var view: View

        init {
            this.view = v
        }

        fun setName(name: String) {
            val txt: TextView = view.findViewById(R.id.txt_name_item)
            txt.text = name
        }

        fun setAnio(anio: Int) {
            val txt: TextView = view.findViewById(R.id.txt_anio_item)
            txt.text = anio.toString()
        }

        fun getCardLayout(): CardView {
            return view.findViewById(R.id.card_package_item)
        }
    }
}