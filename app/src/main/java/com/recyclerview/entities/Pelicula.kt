package com.recyclerview.entities

class Pelicula(nombre: String?, anio: Int?) {

    var nombre: String = ""
    var anio: Int = 0

    init{
        this.nombre = nombre!!
        this.anio = anio!!
    }
}