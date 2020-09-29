package br.com.digitalhouse.desafio.oop.kotlin

class DigitalHouseManager() {
    var alunos = mutableSetOf<Aluno>()
        private set

    var professores = mutableSetOf<Professor>()
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

    fun matricularAluno(codigo: Int, nome: String, sobrenome: String) {
        val aluno = Aluno(codigo, nome, sobrenome)

        if (alunos.contains(aluno))
            throw Exception("Aluno já cadastrado")

        alunos.add(aluno)
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        var aluno: Aluno? = alunos.filter { it.codigo == codigoAluno }.firstOrNull()
                ?: throw Exception("Aluno não localizado")

        var curso: Curso? = localizarCurso(codigoCurso)
                ?: throw Exception("Curso não localizado")

        curso?.matricularAluno(aluno!!)
    }

    fun registrarCurso(codigo: Int, nome: String, numMaxAlunos: Int) {
        val curso = Curso(codigo, nome, numMaxAlunos)

        if (cursos.contains(curso))
            throw Exception("Curso já cadastrado")

        cursos.add(curso)
    }

    fun excluirCurso(codigoCurso: Int) {
        var curso: Curso? = localizarCurso(codigoCurso)
                ?: throw Exception("Curso não localizado")

        cursos.remove(curso)
    }

    fun registrarProfessorAdjunto(codigo: Int, nome: String, sobrenome: String, horasDeMonitoria: Int) {
        val professor = ProfessorAdjunto(codigo, nome, sobrenome, horasDeMonitoria)

        if (professores.contains(professor))
            throw Exception("Professor adjunto já cadastrado")

        professores.add(professor)
    }

    fun registrarProfessorTitular(codigo: Int, nome: String, sobrenome: String, especialidade: String) {
        val professor = ProfessorTitular(codigo, nome, sobrenome, especialidade)

        if (professores.contains(professor))
            throw Exception("Professor titular já cadastrado")

        professores.add(professor)
    }

    fun excluirProfessor(codigoProfessor: Int) {
        var professor: Professor? =  professores.filter { it.codigo == codigoProfessor }.firstOrNull()
                ?: throw Exception("Professor não localizado")

        when (professor) {
            is ProfessorTitular -> desalocarProfessorTitular(professor)
            is ProfessorAdjunto -> desalocarProfessorAdjunto(professor)
        }

        professores.remove(professor)
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {
        var curso: Curso? = localizarCurso(codigoCurso)
                ?: throw Exception("Curso não localizado")

        var professorTitular: Professor? =
                professores.filter { it.codigo == codigoProfessorTitular && it is ProfessorTitular }.firstOrNull()
                    ?: throw Exception("Professor titular não localizado")

        var professorAdjunto: Professor? =
                professores.filter { it.codigo == codigoProfessorAdjunto && it is ProfessorAdjunto }.firstOrNull()
                    ?: throw Exception("Professor adjunto não localizado")

        curso?.alocarProfessorTitular(professorTitular as ProfessorTitular)
        curso?.alocarProfessorAdjunto(professorAdjunto as ProfessorAdjunto)
    }

    private fun localizarCurso(codigoCurso: Int): Curso? {
        return cursos.filter { it.codigo == codigoCurso }.firstOrNull()
    }

    private fun desalocarProfessorTitular(professor: Professor) {
        cursos.filter { curso ->
            curso.professorTitular == professor
        }.forEach { curso ->
            curso.desalocarProfessorTitular()
        }
    }

    private fun desalocarProfessorAdjunto(professor: Professor) {
        cursos.filter { curso ->
            curso.professorAdjunto == professor
        }.forEach { curso ->
            curso.desalocarProfessorAdjunto()
        }
    }
}