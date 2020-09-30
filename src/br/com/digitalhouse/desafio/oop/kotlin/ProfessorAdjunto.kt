package br.com.digitalhouse.desafio.oop.kotlin

data class ProfessorAdjunto(override val codigo: Int,
                            override val nome: String,
                            override val sobrenome: String,
                            val horasDeMonitoria: Int) : Professor() {

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun toString(): String {
        return "Professor Adjunto(código=$codigo, nome=$nomeCompleto, tempo de casa=$tempoDeCasa, horas de monitoria=$horasDeMonitoria)"
    }
}