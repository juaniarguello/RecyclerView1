package com.recyclerview.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.recyclerview.R
import com.recyclerview.adapters.PeliculaAdapter
import com.recyclerview.entities.Pelicula

class ListFragment : Fragment() {

    lateinit var v: View

    lateinit var recPeliculas : RecyclerView
    private lateinit var linearLayoutManager: LinearLayoutManager

    var peliculas : MutableList<Pelicula> = ArrayList<Pelicula>()
    //private lateinit var peliculasListAdapter: PeliculaAdapter

    companion object{
        fun newInstance() = ListFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.list_fragment, container, false)
        recPeliculas = v.findViewById(R.id.rec_peliculas)
        return v
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()

        peliculas.add(Pelicula("Harry Potter 1", 2002))
        peliculas.add(Pelicula("Volver al futuro", 1985))
        peliculas.add(Pelicula("Busqueda implacable", 2012))
        peliculas.add(Pelicula("Buscando a Nemo", 2006))


        recPeliculas.setHasFixedSize(true)
        linearLayoutManager = LinearLayoutManager(context)
        recPeliculas.layoutManager = linearLayoutManager


        var peliculasListAdapter = PeliculaAdapter(peliculas)
        recPeliculas.adapter = peliculasListAdapter
    }

    /*fun onItemClick ( position : Int ) : Boolean {
        Snackbar.make(v,position.toString(),Snackbar.LENGTH_SHORT).show()
        return true
    }*/
}