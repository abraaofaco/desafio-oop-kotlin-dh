package br.com.digitalhouse.desafio.oop.kotlin

data class Curso(val codigo: Int, val nome: String) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Curso

        if (codigo != other.codigo) return false

        return true
    }

    override fun hashCode(): Int {
        return codigo
    }

    override fun toString(): String {
        return "Curso(código=$codigo, nome='$nome')"
    }
}