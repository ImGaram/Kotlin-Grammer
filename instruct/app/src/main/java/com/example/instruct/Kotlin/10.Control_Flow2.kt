package com.example.instruct.Kotlin

//  10 제어흐름
//  when

fun main(args: Array<String>) {
    val value: Int = 1

    when (value) {
        1 -> {  //value 가 1일 때
            println("value is 1")   //출력하는 부분
        }
        2 -> println("value is 2")  //생략 가능
        3 -> println("value is 3")
        else -> println("I do not know value")
    }
    //if로 변경(같은 역할)
    if (value == 1) println("value is 1")
    else if (value == 2) println("value is 2")
    else if (value == 3) println("value is 3")
    else println("I do not know value")

    //값을 리턴하는 when
    val value2 = when (value) {
        1 -> 10
        2 -> 20
        3 -> 30
        else -> 100
    }
    println(value2)
}