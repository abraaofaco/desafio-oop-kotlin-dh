package br.com.digitalhouse.desafio.oop.kotlin

class DigitalHouseManager() {
    var alunos = mutableSetOf<Aluno>()
        private set

    var professores = mutableListOf<Professor>()
        private set

    var cursos = mutableSetOf<Curso>()
        private set

    val matriculas: Map<Curso, List<Aluno>>
        get() {
            return cursos.map { curso ->
                val alunos = curso.matriculas.map { matricula -> matricula.aluno }

                curso to alunos
            }.toMap()
        }

    fun registrarCurso(codigo: Int, nome: String, numMaxAlunos: Int) {
        val curso = Curso(codigo, nome, numMaxAlunos)

        if(cursos.contains(curso))
            throw Exception("Curso já cadastrado")

        cursos.add(curso)
    }

    fun excluirCurso(codigoCurso: Int) {
        var curso: Curso? = cursos.filter { it.codigo == codigoCurso }.firstOrNull()
                ?: throw Exception("Curso não localizado")

        cursos.remove(curso)
    }
}