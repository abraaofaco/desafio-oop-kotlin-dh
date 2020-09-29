package br.com.digitalhouse.desafio.oop.kotlin

fun main() {

    val digitalHouseManager = DigitalHouseManager()

    println(" === ALUNOS === ")

    digitalHouseManager.matricularAluno(1, "Abraão", "Facó")
    digitalHouseManager.matricularAluno(2, "Victor", "Rubens")

    digitalHouseManager.alunos.forEach {
        println(it)
    }

    println(" === CURSOS === ")

    digitalHouseManager.registrarCurso(1, "Android", 2)

    digitalHouseManager.cursos.forEach {
        println(it)
    }

    println(" === PROFESSORES === ")

    digitalHouseManager.registrarProfessorTitular(1, "João", "Camargo", "Android")
    digitalHouseManager.registrarProfessorAdjunto(2, "Vitoria", "Gonçalves", 10)

    //digitalHouseManager.excluirProfessor(1)

    digitalHouseManager.professores.forEach {
        println(it)
    }

    println(" === MATRÍCULAS === ")

    digitalHouseManager.matricularAluno(1, 1)
    digitalHouseManager.matricularAluno(2, 1)

    digitalHouseManager.matriculas.forEach { cursoAlunos ->
        println(cursoAlunos.key)

        cursoAlunos.value.forEach { aluno ->
            println("\t\t$aluno")
        }
    }
}