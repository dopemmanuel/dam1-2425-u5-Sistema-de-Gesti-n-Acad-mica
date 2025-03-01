package com.dam1.u5ej.src.clases

class Estudiante(nombre: String,
                 edad: Int, id: String,
                 val curso: String,
                 val calificacionPromedio: Double
): Persona(nombre, edad, id){
    init{
        require(curso.isNotEmpty()){ IllegalArgumentException("ERROR: El campo del curso no puede estar vacio.") }
        require(calificacionPromedio in 0.0..10.0){ IllegalArgumentException("ERR0R: La calificación promedio debe estar entre 0.0 y 10.0.")}
    }
    fun mostrarCalificacion(): String {
        return "$nombre esta en el curso $curso y su calificacion es $calificacionPromedio."
    }
    override fun mostrarRoll(): String {
        return "Su nombre es $nombre, tiene $edad años, se identifica con el ID: $id y es estudiante."
    }
}