package br.com.digitalhouse.desafio.oop.kotlin

abstract class Professor : Pessoa {
    var tempoDeCasa: Int = 0
    private set

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Professor) return false

        if (codigo != other.codigo) return false

        return true
    }

    override fun hashCode(): Int {
        return codigo
    }


}