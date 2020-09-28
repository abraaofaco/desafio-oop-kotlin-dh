package br.com.digitalhouse.desafio.oop.kotlin

fun main() {
    val alunoAbraao = Aluno(1, "Abraão", "Facó")
    val eAlunoAbraao = Aluno(1, "Abraão", "Facó")

    println(alunoAbraao)

    println(alunoAbraao.equals(eAlunoAbraao))
}