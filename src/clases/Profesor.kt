package com.dam1.u5ej.src.clases

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