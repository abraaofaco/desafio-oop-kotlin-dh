package br.com.digitalhouse.desafio.oop.kotlin

data class Curso(val codigo: Int,
                 val nome: String,
                 val professorTitular: ProfessorTitular,
                 val professorAdjunto: ProfessorAdjunto,
                 val numMaxAlunos: Int) {

    var matriculas = mutableSetOf<Matricula>()
        private set

    constructor(codigo: Int,
                nome: String,
                professorTitular: ProfessorTitular,
                professorAdjunto: ProfessorAdjunto,
                numMaxAlunos: Int,
                vararg matriculas: Matricula) : this(codigo, nome, professorTitular, professorAdjunto, numMaxAlunos) {

        if (matriculas.size > numMaxAlunos)
            throw Exception("Número de alunos maior que o permitido para o curso")

        this.matriculas.addAll(matriculas)
    }

    fun matricularAluno(aluno: Aluno): Boolean {
        if (!matriculas.filter { it.aluno == aluno }.any()) {
            if (matriculas.size + 1 > numMaxAlunos)
                return false

            val matricula = Matricula(aluno)
            matriculas.add(matricula)
        }

        return true
    }

    fun excluirMatriculaAluno(aluno: Aluno) {
        var matricula: Matricula? = matriculas.filter { it.aluno == aluno }.firstOrNull()
                ?: throw Exception("Matrícula não localizada para o aluno ${aluno.nomeCompleto}")

        matriculas.remove(matricula)
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