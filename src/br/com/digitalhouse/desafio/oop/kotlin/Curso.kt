package br.com.digitalhouse.desafio.oop.kotlin

data class Curso(val codigo: Int,
                 val nome: String,
                 val professorTitular: ProfessorTitular,
                 val professorAdjunto: ProfessorAdjunto,
                 val numMaxAlunos: Int) {

    var alunos = mutableListOf<Aluno>()
        private set

    constructor(codigo: Int,
                nome: String,
                professorTitular: ProfessorTitular,
                professorAdjunto: ProfessorAdjunto,
                numMaxAlunos: Int,
                vararg alunos: Aluno) : this(codigo, nome, professorTitular, professorAdjunto, numMaxAlunos) {

        if (alunos.size > numMaxAlunos)
            throw Exception("Número de alunos maior que o permitido para o curso")

        this.alunos.addAll(alunos)
    }

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
        return "Curso(código=$codigo, nome='$nome', nº máx. de alunos=$numMaxAlunos) " +
                "\n\t $professorTitular \n\t $professorAdjunto"
    }
}