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

    println("=== PROFESSOR ===")

    val professorJoao = Professor(1, "João", "Camargo", 0)
    val eProfessorJoao = Professor(1, "João", "Camargo", 0)

    println(professorJoao)

    println(professorJoao.equals(eProfessorJoao))
}