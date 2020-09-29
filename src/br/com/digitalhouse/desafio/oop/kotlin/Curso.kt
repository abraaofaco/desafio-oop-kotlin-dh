package br.com.digitalhouse.desafio.oop.kotlin

data class Curso(val codigo: Int, val nome: String, val numMaxAlunos: Int) {

    var professorTitular: ProfessorTitular? = null
        private set

    var professorAdjunto: ProfessorAdjunto? = null
        private set

    var matriculas = mutableSetOf<Matricula>()
        private set

    fun matricularAluno(aluno: Aluno) {
        if (matriculas.filter { it.aluno == aluno }.any())
            throw Exception("Aluno já matrículado")

        if (matriculas.size + 1 > numMaxAlunos)
            throw Exception("Curso sem vaga disponível")

        val matricula = Matricula(aluno)

        matriculas.add(matricula)
    }

    fun excluirMatriculaAluno(aluno: Aluno) {
        var matricula: Matricula? = matriculas.filter { it.aluno == aluno }.firstOrNull()
                ?: throw Exception("Matrícula não localizada")

        matriculas.remove(matricula)
    }

    fun alocarProfessorTitular(professor: ProfessorTitular) {
        professorTitular = professor
    }

    fun alocarProfessorAdjunto(professor: ProfessorAdjunto) {
        professorAdjunto = professor
    }

    fun desalocarProfessorTitular() {
        professorTitular = null
    }

    fun desalocarProfessorAdjunto() {
        professorAdjunto = null
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
                "\n\t ${professorTitular ?: "Professor titular não definido"}  " +
                "\n\t ${professorAdjunto ?: "Professor adjunto não definido"}"
    }
}