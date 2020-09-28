package br.com.digitalhouse.desafio.oop.kotlin

data class Professor(override val codigo: Int,
                     override val nome: String,
                     override val sobrenome: String,
                     val tempoDeCasa: Int) : Pessoa {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Professor

        if (codigo != other.codigo) return false

        return true
    }

    override fun hashCode(): Int {
        return codigo
    }

    override fun toString(): String {
        return "Professor(código=$codigo, nome=$nomeCompleto, tempo de casa=$tempoDeCasa)"
    }
}