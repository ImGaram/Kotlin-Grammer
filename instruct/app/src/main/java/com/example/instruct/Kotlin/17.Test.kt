package com.example.instruct.Kotlin

fun main(array: Array<String>) {
    println(second(80))
    println()
    println(third(87))
    println()
    println(fourth())
}

fun second(score: Int): String {
    when (score) {
        in 90..100 -> {
            return "A"
        }
        in 80..90 -> {
            return "B"
        }
        in 70..79 -> {
            return "C"
        }
        else -> {
            return "F"
        }
    }
}

fun third(number: Int): Int {
    var a = number % 10
    var b = number / 10
    return a + b
}

fun fourth() {
    for (x in 1..9) {
        for (y in 1..9) {
            println("$x * $y = ${x * y}")
        }
    }
}