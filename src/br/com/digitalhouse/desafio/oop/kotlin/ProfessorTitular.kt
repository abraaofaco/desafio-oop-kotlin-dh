package br.com.digitalhouse.desafio.oop.kotlin

data class ProfessorTitular(override val codigo: Int,
                            override val nome: String,
                            override val sobrenome: String,
                            val especialidade: String) : Professor() {

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun toString(): String {
        return "Professor Titular(código=$codigo, nome=$nomeCompleto, tempo de casa=$tempoDeCasa, especialidade='$especialidade')"
    }
}