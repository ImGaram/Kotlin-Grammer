package com.example.instruct.Kotlin

//  16. 반복문

fun main(array: Array<String>) {

    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    //반복하는 방법 (1)
    for (item in a) {    //a반복
        if (item == 5) println("item is 5")
        else println("item is not 5")
    }
    println()

    //반복하는 방법 (2)
    for ((index, item) in a.withIndex()) {  //인덱스와 아이템 모두 얻을 수 있음
        println("index :" + index + "value:" + item)
        //문자열 + Int = 문자열
        //문자열 + 아무거나 = 문자열
    }

    //반복하는 방법 (3)
    a.forEach {
        println(it) //lambda 문법
    }
    println()

    //반복하는 방법 (4)
    a.forEach { item -> //it 대신해서 사용하는 방법
        println(item)
    }
    println()

    //반복하는 방법 (5)
    a.forEachIndexed { index, item ->   //반복하는 방법 (2) 와 동일한 역할
        println("index :" + index + "value:" + item)
    }
    println()

    //반복하는 방법 (6)
    println(a.size)
    println()
    for (i in 0 until a.size) {  //인덱스만 출력하는 for 문
        //until 은 마지막을 포함하지 않음(0~8)
        println(a.get(i))   //a의 사이즈 만큼 반복
    }
    println()

    //반복하는 방법(7)
    for (i in 0 until a.size step (2)) {    //step 의 숫자만큼 증가 (2씩 증가)
        println(a.get(i))
    }
    println()

    //반복하는 방법(8)
    for (i in a.size - 1 downTo (0)) {  //내림차순 출력
        println(a.get(i))
    }
    println()

    //반복하는 방법(9)
    for (i in a.size - 1 downTo (0) step (2)) {  //2만큼 내림차순 출력
        println(a.get(i))
    }
    println()

    //반복하는 방법(10)
    for (i in 0..a.size) {    //10까지 모두 (until 은 0~9까지 출력)
        // ..은 마지막을 포함한다
        println(i)
    }

    //반복하는 방법(11)
    var b: Int = 0
    var c: Int = 4
    println()

    while (b < c) { //조건이 참일때까지 반복
        b++ //증감연산자
        println("b")
    }
    println()

    var d: Int = 0
    var e: Int = 4
    //반복하는 방법(12)
    do {    //do while 은 조건식이 거짓이더라도 무조건 한번은 실행함
        println("Hello")
        d++
    } while (d < e)
}