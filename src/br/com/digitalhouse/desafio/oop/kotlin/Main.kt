package br.com.digitalhouse.desafio.oop.kotlin

fun main() {

    try {
        val digitalHouseManager = DigitalHouseManager()

        println(" === ALUNOS === ")

        digitalHouseManager.matricularAluno(1, "Abraão", "Facó")
        digitalHouseManager.matricularAluno(2, "Victor", "Rubens")
        digitalHouseManager.matricularAluno(3, "Lucas", "Macedo")

        digitalHouseManager.alunos.forEach {
            println(it)
        }

        println(" === CURSOS === ")

        digitalHouseManager.registrarCurso(20001, "Full Stack", 3)
        digitalHouseManager.registrarCurso(20002, "Android", 2)

        digitalHouseManager.cursos.forEach {
            println(it)
        }

        println(" === PROFESSORES === ")

        digitalHouseManager.registrarProfessorTitular(1, "João", "Camargo", "Android")
        digitalHouseManager.registrarProfessorAdjunto(2, "Vitoria", "Gonçalves", 10)

        digitalHouseManager.alocarProfessores(20001, 1, 2)
        digitalHouseManager.alocarProfessores(20002, 1, 2)

        digitalHouseManager.professores.forEach {
            println(it)
        }

        println(" === MATRÍCULAS === ")

        digitalHouseManager.matricularAluno(1, 20001)
        digitalHouseManager.matricularAluno(2, 20001)

        digitalHouseManager.matriculas.forEach { cursoAlunos ->
            println(cursoAlunos.key)

            cursoAlunos.value.forEach { aluno ->
                println("\t\t$aluno")
            }
        }

        digitalHouseManager.matricularAluno(1, 20002)
        digitalHouseManager.matricularAluno(2, 20002)
        digitalHouseManager.matricularAluno(3, 20002)

    } catch (ex: Exception) {
        println("[ERRO]: ${ex.message}")
    }
}