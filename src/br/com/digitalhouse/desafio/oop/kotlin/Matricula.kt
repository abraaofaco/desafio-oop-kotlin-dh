package br.com.digitalhouse.desafio.oop.kotlin

import br.com.digitalhouse.desafio.oop.kotlin.util.*
import java.util.*

data class Matricula(val aluno: Aluno) {
    var dataMatricula: Date
    private set

    init {
        dataMatricula = Date()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Matricula) return false

        if (aluno != other.aluno) return false

        return true
    }

    override fun hashCode(): Int {
        return aluno.hashCode()
    }

    override fun toString(): String {
        return "Matrícula(aluno=${aluno.nomeCompleto}, data=${dataMatricula.toSimpleString()} )"
    }
}