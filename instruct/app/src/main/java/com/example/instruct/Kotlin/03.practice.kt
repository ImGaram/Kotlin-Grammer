package com.example.instruct.Kotlin

var a = 1+2+3+4+5   //연산의 결과값도 변수에 넣어줄수 있다
var b = "1"
var c = b.toInt()   //b의 문자 1을 정수형으로 바꿔 c에 저장
var d = b.toFloat() //b의 문자 1을 실수형으로 바꿔 c에 저장

var e = "John"
var f = "My name is $e Nice to meet you"    //$e에 저장되어 있는 John 대입

//Null
//  -존재하지 않는 값(휴지를 다 씀 = 0, 휴지 심도 없고 휴지도 없음 = Null)

//var abc : Int = null  Int 는 null 을 받을 수 없는 null 이다
var abc1 : Int? = null  //?를 받은 자료형은 널을 가질 수 있는 자료형이다
var abc2 : Double? = null  //널을 받을수 있는 자료형 Double

var g = a + 3   //15+3=13

fun main(array : Array<String>){
    println(a)
    println(b)
    println(c)
    println(d)
    println(f)
    println(abc1)   //"null" (x)
    println(g)
}