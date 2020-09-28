package br.com.digitalhouse.desafio.oop.kotlin

import br.com.digitalhouse.desafio.oop.kotlin.util.*
import java.util.*

class Matricula(val aluno: Aluno, val curso: Curso) {
    var dataMatricula: Date
    private set

    init {
        dataMatricula = Date()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Matricula

        if (aluno != other.aluno) return false
        if (curso != other.curso) return false

        return true
    }

    override fun hashCode(): Int {
        var result = aluno.hashCode()
        result = 31 * result + curso.hashCode()

        return result
    }

    override fun toString(): String {
        return "Matrícula(aluno=${aluno.nomeCompleto}, curso=${curso.nome}, data=${dataMatricula.toSimpleString()} )"
    }
}