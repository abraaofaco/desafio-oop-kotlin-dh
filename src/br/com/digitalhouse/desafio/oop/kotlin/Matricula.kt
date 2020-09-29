package br.com.digitalhouse.desafio.oop.kotlin

import br.com.digitalhouse.desafio.oop.kotlin.util.*
import java.util.*

data class Matricula(val aluno: Aluno) {
    var dataMatricula: Date
    private set

    init {
        dataMatricula = Date()
    }

    override fun toString(): String {
        return "Matrícula(aluno=${aluno.nomeCompleto}, data=${dataMatricula.toSimpleString()} )"
    }
}