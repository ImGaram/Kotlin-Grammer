package com.example.instruct.Kotlin

import org.w3c.dom.Text

// 변수의 접근 범위
// 1. 전역변수 -> 모든 지역
// 2. 지역변수 -> 일부 지역
// 2-1. 지역변수의 종류는 많다 : class 변수, 함수 변수

var number100 :Int = 10 //전역 변수

fun main(args:Array<String>) {
    println(number100)
    val test = Test("홍길동")
    test.textFun()
    test.name
    println(number100)
}

class Test(var name:String){    // 지역 변수, main 에서 접근 불가
    fun textFun(){
        var birth:String = "2000/3/1"   //textFun 에서만 사용 가능
        name = "홍길동"
        number100=100
        fun textFun2(){
            var gender: String = "남"
        }
    }
    fun testFun2(){
        name
    }
}