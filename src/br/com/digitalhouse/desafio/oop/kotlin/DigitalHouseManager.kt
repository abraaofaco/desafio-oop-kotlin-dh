package br.com.digitalhouse.desafio.oop.kotlin

class DigitalHouseManager() {
    var alunos = mutableSetOf<Aluno>()
    private set

    var professores = mutableListOf<Professor>()
    private set

    var cursos = mutableSetOf<Curso>()
    private set

    constructor(alunos: List<Aluno>, professores: List<Professor>, cursos: List<Curso>) : this() {
        this.alunos.addAll(alunos)
        this.professores.addAll(professores)

        //Validação inicial
        cursos.forEach { curso ->
            if(!this.professores.contains(curso.professorTitular) || !this.professores.contains(curso.professorAdjunto))
                throw Exception("Professor não localizado")

            curso.matriculas.forEach {matricula ->
                if(!this.alunos.contains(matricula.aluno))
                    throw Exception("Aluno não localizado")
            }
        }

        this.cursos.addAll(cursos)
    }

    val matriculas: Map<Curso, List<Aluno>>
        get() {
            return cursos.map { curso ->
                val alunos = curso.matriculas.map { matricula ->  matricula.aluno }

                curso to alunos
            }.toMap()
        }
}