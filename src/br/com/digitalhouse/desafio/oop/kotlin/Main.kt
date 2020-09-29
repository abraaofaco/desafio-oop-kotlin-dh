package br.com.digitalhouse.desafio.oop.kotlin

fun main() {
    val alunoAbraao = Aluno(1, "Abraão", "Facó")
    val alunoVictor = Aluno(2, "Victor", "Rubens")

    val profTitularJoao = ProfessorTitular(1, "João", "Camargo", 0, "Android")
    val profAdjuntoVitoria = ProfessorAdjunto(1, "Vitoria", "Gonçalves", 0, 0)

    val digitalHouseManager = DigitalHouseManager()

    digitalHouseManager.registrarCurso(1, "Android", 2)
    //digitalHouseManager.excluirCurso(1)

    digitalHouseManager.matriculas.forEach { cursoAlunos ->
        println(cursoAlunos.key)

        cursoAlunos.value.forEach { aluno ->
            println("\t\t$aluno")
        }
    }
}