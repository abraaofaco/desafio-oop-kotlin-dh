package br.com.digitalhouse.desafio.oop.kotlin

data class ProfessorTitular(override val codigo: Int,
                            override val nome: String,
                            override val sobrenome: String,
                            val especialidade: String) : Professor {

    override var tempoDeCasa: Int = 0
    private set

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ProfessorTitular

        if (codigo != other.codigo) return false

        return true
    }

    override fun hashCode(): Int {
        return codigo
    }

    override fun toString(): String {
        return "Professor Titular(código=$codigo, nome=$nomeCompleto, tempo de casa=$tempoDeCasa, especialidade='$especialidade')"
    }
}