package com.dam1.u5ej.src.clases

open class Persona(val nombre: String,
                    val edad: Int,
                    val id: String
){
    init{
        require(edad > 0) { IllegalArgumentException("ERR0R: el year debe ser mayor que 0.") }
        require(nombre.isNotEmpty() || id.isNotEmpty()){ IllegalArgumentException("ERROR: El campo no debe estar vacio.")}

    }
    open fun mostrarRoll(): String {
        return "Su nombre es $nombre tiene $edad años y se identifica con el ID: $id y no tiene un rol. "
    }
}