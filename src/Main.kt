package com.dam1.u5ej.src

/**
Ejercicio 9: Sistema de Gestión Académica
Descripción: Crea una jerarquía de clases para representar distintos roles en un entorno académico,
como estudiantes y profesores.

Clases a implementar:
Clase Base Persona
Propiedades comunes: nombre (String), edad (Int), id (String).
Método mostrarRol(), que imprime el rol de la persona (Estudiante, Profesor, etc.).
Clase Derivada Estudiante
Propiedades específicas: curso (String), calificacionPromedio (Double).
Implementa el método mostrarRol() y añade un método mostrarCalificacion() para imprimir la calificación
promedio.
Clase Derivada Profesor
Propiedades específicas: departamento (String), aniosExperiencia (Int).
Implementa el método mostrarRol() y añade un método mostrarExperiencia() para imprimir los años de
experiencia.
Objetivo: Familiarizarse con la herencia y cómo las clases derivadas pueden tener propiedades y métodos
adicionales, así como comportamientos específicos.
 */

open class Persona(val nombre: String, val edad: Int, val id: String){

    init{
        require(edad > 0) { IllegalArgumentException("ERR0R: el year debe ser mayor que 0.") }
        require(nombre.isNotEmpty() || id.isNotEmpty()){ IllegalArgumentException("ERROR: El campo no debe estar vacio.")}
    }

    open fun mostrarRoll(): String {
        return "Su nombre es $nombre tiene $edad años y se identifica con el ID: $id y no tiene un rol. "
    }
}

class Estudiante(nombre: String, edad: Int, id: String, val curso: String, val calificacionPromedio: Double): Persona(nombre, edad, id){


    fun mostrarCalificacion(): String {
        return ""
    }

    override fun mostrarRoll(): String {
        return "Su nombre es $nombre, tiene $edad años, se identifica con el ID: $id y es estudiante."
    }
}

fun main(){

}