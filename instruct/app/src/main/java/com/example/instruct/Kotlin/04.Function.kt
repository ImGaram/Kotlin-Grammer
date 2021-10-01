package com.example.instruct.Kotlin

//04.function
//  -함수
//  -어떤 input 을 넣으면 어떤 output 이 나온다
//  - y = x + 2

//함수를 선언하는 방법
//fun 함수명 (변수명 : 타입, 변수명 : 타입.....) : 반환형 {
//      함수내용
//      return 반환값
//}
fun plus(first: Int, second: Int) : Int{
//    println(first)
//    println(second)
    val res : Int = first + second
//    println(res)
    return res  //두 변수의 합을 반환
}

fun main(array:Array<String>){
    //함수를 호출하는 방법
    val res = plus(5, 10) //first = 5, second = 10
    println(res)
    //인수를 명시적으로 전달할 수 있는 방법
    val res2 = plus(first = 20, second = 30)
    println(res2)
    val res3 = plus(second = 100,first = 10)    //어떤 순서로 변수를 넣어도 상관없음
    println(res3)
}