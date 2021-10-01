package com.example.instruct.Kotlin

//  12.배열
//배열이 필요한 이유
//  -그룹(많은 변수)이 필요할때

fun main(array: Array<String>) {

    //배열을 생성하는 방법(1)
    var number: Int = 10
    var group1 = arrayOf<Int>(1, 2, 3, 4, 5)
    println(group1 is Array)    //group1은 배열이다

    //배열을 생성하는 방법(2) 타입을 생략함
    var number1 = 10 //10을 보고 변수 타입 정함
    var group2 = arrayOf(1, 2, 3.5, "Hello")    //여러 가지 타입을 넣을 수 있다

    // Index 란?
    // 배열의 순서
    // [1,2,3,4,5]
    // 0부터 시작
    // index 0 -> 1, index 1 -> 2

    //배열의 값을 꺼내는 방법
    val test1 = group1.get(0)
    val test2 = group1.get(4)
    println(test1)
    println(test2)

    //배열의 값을 꺼내는 방법(2)
    val test3 = group1[0]
    println(test3)

    //배열의 값을 바꾸는 방법
    group1.set(0, 100)
    println(group1[0])

    //배열의 값을 바꾸는 방법(2)
    group1[0] = 200
    println(group1[0])
}