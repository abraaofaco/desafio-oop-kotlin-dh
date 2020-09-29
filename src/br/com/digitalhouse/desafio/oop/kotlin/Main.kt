package br.com.digitalhouse.desafio.oop.kotlin

fun main() {

    val alunoAbraao = Aluno(1, "Abraão", "Facó")
    val alunoVictor = Aluno(2, "Victor", "Rubens")

    val digitalHouseManager = DigitalHouseManager()

    println(" === CURSOS === ")

    digitalHouseManager.registrarCurso(1, "Android", 2)

    digitalHouseManager.cursos.forEach {
        println(it)
    }

    println(" === PROFESSORES === ")

    digitalHouseManager.registrarProfessorTitular(1, "João", "Camargo", "Android")
    digitalHouseManager.registrarProfessorAdjunto(2, "Vitoria", "Gonçalves", 10)
    //digitalHouseManager.registrarProfessorAdjunto(1, "João", "Camargo", 10)

    digitalHouseManager.excluirProfessor(1)

    digitalHouseManager.professores.forEach {
        println(it)
    }

    println(" === MATRÍCULAS === ")

    digitalHouseManager.matriculas.forEach { cursoAlunos ->
        println(cursoAlunos.key)

        cursoAlunos.value.forEach { aluno ->
            println("\t\t$aluno")
        }
    }
}