package br.com.digitalhouse.desafio.oop.kotlin

interface Pessoa {
    val codigo: Int
    val nome: String
    val sobrenome: String
    val nomeCompleto: String
        get() = "$nome $sobrenome"
}