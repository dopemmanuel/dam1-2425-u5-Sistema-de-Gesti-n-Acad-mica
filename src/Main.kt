package com.dam1.u5ej.src


import com.dam1.u5ej.src.clases.Persona
import com.dam1.u5ej.src.clases.Profesor
import com.dam1.u5ej.src.clases.Estudiante
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