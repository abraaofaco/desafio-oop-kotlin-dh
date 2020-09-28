package br.com.digitalhouse.desafio.oop.kotlin

data class ProfessorAdjunto(override val codigo: Int,
                            override val nome: String,
                            override val sobrenome: String,
                            override val tempoDeCasa: Int,
                            val horasDeMonitoria: Int) : Professor {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ProfessorAdjunto

        if (codigo != other.codigo) return false

        return true
    }

    override fun hashCode(): Int {
        return codigo
    }

    override fun toString(): String {
        return "Professor(a) Adjunto(código=$codigo, nome=$nomeCompleto, tempo de casa=$tempoDeCasa, horas de monitoria=$horasDeMonitoria)"
    }
}