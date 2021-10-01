package com.example.instruct.Kotlin

//  -디폴드 값(기본 값)을 가지는 함수
fun plusFive(first :Int, second :Int=5): Int {
    val res : Int = first + second
    return res
}
//  -반환 값이 없는 함수 만들기(1)
fun printPlus(first :Int,second : Int):Unit{    //Unit(생략 가능) 는 아무 것도 리턴하지 않겠다는 뜻
    val result:Int = first+second
    println(result)
}

//  -반환 값이 없는 함수 만들기(2)
fun printPlus2(first :Int,second : Int){
    val result:Int = first+second
    println(result)
}

//  -간단하게 함수를 선언하는 방법
fun plusShort(first: Int,second: Int) = first + second  //함수의 기능이 달라지지 않음

//  -가변 인자를 가지는 함수 선언하는 방법
fun plusMany(vararg numbers:Int){   //1개부터 n 개까지의 인수를 받을 수 있다
    for(number in numbers){ //반복문
        println(number)
    }
}

//  디폴드 값을 가지는 함수 호출하기
fun main(array : Array<String>){
    val result4 = plusFive(10, 20)
    println(result4)

    val result5 = plusFive(10)
    println(result5)
    println()
    printPlus(10,20)
    printPlus2(10,20)
    val res = plusShort(50,50)
    println(res)

    println()
    plusMany(1,2,3) //여러개 출력
    plusMany(100)
}