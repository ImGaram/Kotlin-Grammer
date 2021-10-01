package com.example.instruct.Kotlin

//02. 자료형
//  -정수형 -> Long -> Int -> Short -> Byte 클수록 자료형의 범위가 크다
//  -실수형 -> Double -> Float
//  -문자 -> Char
//  -문자열 -> String
//  -논리형 -> True/False -> Boolean

var number = 10 //정수형, 앞으로도 계속 정수형만 들어가야 함

//변수를선언하는 방법 2
// var/val 변수 : 자료형 = 값
var number1 : Int =20   //변수에 꼭 자료형을 안 넣어도 됌
var hello1 : String = "Hello"
var point1 : Double = 3.4

//variable or value??
//  -1 변하지 않는 값이라면 : value
//  -2 변할지 안변할지 모르겠다 : value 에서 variable 로 바꾸기

fun main(array: Array<String>){
    number = 20 //같은 자료형(정수)
    //number = 20.5 자료형과 다른 값 입력시 오류
}