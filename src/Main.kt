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

class Profesor(nombre: String,
               edad: Int,
               id: String,
               val departamento: String,
               val aniosExperiencia: Int
): Persona(nombre, edad, id){
    init {
        require(departamento.isNotEmpty()) { "ERROR: El departamento no puede estar vacío." }
        require(aniosExperiencia >= 0) { "ERROR: Los años de experiencia no pueden ser negativos." }
    }
    fun mostrarExperiencia(): String {
        return "$nombre tiene $aniosExperiencia años de experiencia en el departamento $departamento."
    }
    override fun mostrarRoll(): String {
        return "$nombre es profesor, tiene $edad de edad, su id: $id."
    }
}


fun main(){
    val persona = Persona("Gabriel", 25,"CP001")
    val estudiante = Estudiante("Juan", 20, "E001", "Matemáticas", 8.5)
    val profesor = Profesor("Ana", 35, "P001", "Ciencias", 10)

    println(persona.mostrarRoll())

    println(estudiante.mostrarRoll())
    println(estudiante.mostrarCalificacion())

    println(profesor.mostrarRoll())
    println(profesor.mostrarExperiencia())
}