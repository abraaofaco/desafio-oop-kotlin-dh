package br.com.digitalhouse.desafio.oop.kotlin

data class Aluno(override val codigo: Int, override val nome: String, override val sobrenome: String) : Pessoa {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Aluno

        if (codigo != other.codigo) return false

        return true
    }

    override fun hashCode(): Int {
        return codigo
    }

    override fun toString(): String {
        return "Aluno(código=$codigo, nome='$nomeCompleto')"
    }
}