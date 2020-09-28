package br.com.digitalhouse.desafio.oop.kotlin.util

import java.text.SimpleDateFormat
import java.util.*

fun Date.toSimpleString(): String {
    val format = SimpleDateFormat("dd/MM/yyy")
    return format.format(this)
}

