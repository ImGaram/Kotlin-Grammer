package com.example.instruct.Kotlin

//  08.제어흐름(조건문)
//  -if, else

fun main(array: Array<String>){
    val a : Int = 5
    val b : Int = 10

    //if else 를 사용하는 방법
    if (a>b){
        println("a가 b보다 크다")
    }else{
        println("a가 b보다 작다")
    }

    //if else 를 사용하는 방법(2)
    if (a>b){
        println("a 가 b 보다 크다")
    }
    //if else else if 사용하는 방법
    if (a>b){
        println("a가 b보다 크다")
    }else if (a<b){
        println("a가 b보다 작다")
    }else if (a==b){
        println("a와 b가 같다")
    }else{

    }

    //값을 리턴하는 if 사용 방법
    val max = if(a>b){  //a 가 b 보다 작기 때문에
        a   //5
    }else{
        b   //10 출력
    }

    if(a>b) a else b    //더 간결하게 쓸수 있는 방법
    println()
    println(max)
}