package br.com.digitalhouse.desafio.oop.kotlin

class DigitalHouseManager {
    var alunos = mutableSetOf<Aluno>()
    private set

    var professores = mutableListOf<Professor>()
    private set

    var matriculas = mutableSetOf<Matricula>()
    private set
}