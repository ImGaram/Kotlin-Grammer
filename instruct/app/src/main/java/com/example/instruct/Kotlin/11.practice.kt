package com.example.instruct.Kotlin

//제어 흐름 실습

fun main(args: Array<String>) {
    val value: Int? = null

    when (value) {
        null -> println("value is null")
        else -> println("value is not null")
    }
    val value2: Boolean? = null

    //when 은 조건으로 가지는 모든 값의 모든 경우에 대응 해주는 것이 좋다
    when (value2) {
        true -> println("")
        false -> println("")
        null -> println("")
    }
    //값을 리턴하는 when 은 반드시 값을 리턴해야 함
    val value3 = when (value2) {
        true -> 1
        false -> 3
        null -> 4
    }

    //when 의 다양한 조건식
    val value4: Int = 10
    when (value4) {
        is Int -> { //is Int = value4 가 Int 인가?
            println("value4 is int")
        }
        else -> {
            println("value4 is int")
        }
    }
    //when 의 다양한 조건식(2)
    val value5: Int = 70
    when(value5){
        in 60..70->{    //value5 가 60부터 70사이인가?
            println("value is in 60-70")
        }
        in 70..80->{
            println("value is in 70-80")
        }
        in 80..90->{
            println("value is in 80-90")
        }
    }
}