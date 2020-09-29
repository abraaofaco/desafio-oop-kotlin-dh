package br.com.digitalhouse.desafio.oop.kotlin

fun main() {

    val alunoAbraao = Aluno(1, "Abraão", "Facó")
    val alunoVictor = Aluno(2, "Victor", "Rubens")

    //val profTitularJoao = ProfessorTitular(1, "João", "Camargo", 0, "Android")

    val digitalHouseManager = DigitalHouseManager()

    digitalHouseManager.registrarCurso(1, "Android", 2)

    digitalHouseManager.registrarProfessorTitular(1, "João", "Camargo", "Android")
    digitalHouseManager.registrarProfessorAdjunto(2, "Vitoria", "Gonçalves", 10)

    println(" === PROFESSORES === ")

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