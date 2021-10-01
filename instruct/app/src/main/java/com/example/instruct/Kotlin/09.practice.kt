package com.example.instruct.Kotlin

fun main(args: Array<String>) {
    val a: Int? = null
    val b: Int = 10
    val c: Int = 100

    if (a == null) {
        println("a is null")
    } else {
        println("a is not null")
    }

    if (b + c == 110) {
        println("b 더하기 c 는 110 이다")
    } else {
        println("b 더하기 c 는 110이 아니다")
    }

    //엘비스 연산자
    val number: Int? = null
    val number2 = number ?: 10    //number 가 null 이면 10이 들어감
    println(number2)    //number 가 null 이 아닌 경우 그 수가 들어감

    val num1: Int = 10
    val num2: Int = 20
    //값을 리턴하는 if 는 무조건 값이 리턴되야 하므로 else 가 필수이다
    val max = if (num1 > num2) {
        num1
    } else if (num1 == num2) {
        num2
    } else{

    }
}