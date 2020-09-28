package br.com.digitalhouse.desafio.oop.kotlin

fun main() {
    println("=== ALUNO ===")

    val alunoAbraao = Aluno(1, "Abraão", "Facó")
    val eAlunoAbraao = Aluno(1, "Abraão", "Facó")

    println(alunoAbraao)

    println(alunoAbraao.equals(eAlunoAbraao))

    println("=== CURSO ===")

    val cursoAndroid = Curso(1, "Android")
    val eCursoAndroid = Curso(1, "Android")

    println(cursoAndroid)

    println(cursoAndroid.equals(eCursoAndroid))

    println("=== PROFESSOR TITULAR ===")

    val professorJoao = ProfessorTitular(1, "João", "Camargo", 0, "Android")
    val eProfessorJoao = ProfessorTitular(1, "João", "Camargo", 0, "Android")

    println(professorJoao)

    println(professorJoao.equals(eProfessorJoao))

    println("=== PROFESSOR ADJUNTO ===")

    val professoraVitoria = ProfessorAdjunto(1, "Vitoria", "Gonçalves", 0, 0)
    val eProfessoraVitoria = ProfessorAdjunto(1, "Vitoria", "Gonçalves", 0, 0)

    println(professoraVitoria)

    println(professoraVitoria.equals(eProfessoraVitoria))
}