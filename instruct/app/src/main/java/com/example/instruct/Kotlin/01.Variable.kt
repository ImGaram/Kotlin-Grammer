package com.example.instruct.Kotlin

//01.variable -> 변수
// -> 상자
//선언 방법 = var/val 변수명 = 값
//variable/value
// variable -> 내 마음대로 원하는 것을 넣을 수 있다
// value -> 한번 넣으면 다시는 바꿀 수 없는 상자

var num =10
var hello = "hello"
var point =3.4

val fix = 20

fun main(args:Array<String>){
    println(num)
    println(hello)
    println(point)
    println(fix)

    num = 100   //숫자들을 바꿈
    hello = "God Bye"
    point = 10.4

    println(num)    //숫자들이 바뀐 결과가 출력
    println(hello)
    println(point)

    //fix = 500     val 변수는 변숫값을 변경할수 없음 하면 ㅈ버그
}