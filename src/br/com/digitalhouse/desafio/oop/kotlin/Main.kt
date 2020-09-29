package br.com.digitalhouse.desafio.oop.kotlin

fun main() {
    val alunoAbraao = Aluno(1, "Abraão", "Facó")
    val alunoVictor = Aluno(2, "Victor", "Rubens")

    val profTitularJoao = ProfessorTitular(1, "João", "Camargo", 0, "Android")
    val profAdjuntoVitoria = ProfessorAdjunto(1, "Vitoria", "Gonçalves", 0, 0)

    val cursoAndroid = Curso(1, "Android", profTitularJoao, profAdjuntoVitoria, 2)
    val cursoAndroid2 = Curso(2, "Android2", profTitularJoao, profAdjuntoVitoria, 2)

    cursoAndroid.matricularAluno(alunoAbraao)
    cursoAndroid.matricularAluno(alunoVictor)

    val digitalHouseManager = DigitalHouseManager(
            listOf(alunoAbraao, alunoVictor),
            listOf(profAdjuntoVitoria, profTitularJoao),
            listOf(cursoAndroid, cursoAndroid2)
    )

    digitalHouseManager.matriculas.forEach { cursoAlunos ->
        println(cursoAlunos.key)

        cursoAlunos.value.forEach { aluno ->
            println("\t\t$aluno")
        }
    }
}