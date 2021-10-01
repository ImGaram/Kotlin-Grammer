package com.example.instruct.Kotlin

fun plusThree(first:Int ,second:Int ,third:Int):Int{
    return first + second + third   //더 간단히 만들수 있는 방법
}

fun minusThree(first: Int, second: Int, third: Int) = first - second - third    //first 와 second 와 third 의 차를 출력

fun multiplyThree(first: Int = 1, second: Int = 1, third: Int = 1): Int { //아무것도 안하면 이것들은 모두 1임(기본값을 전달해서)
    return first * second * third
}

//내부 함수(함수안에 함수가 있음)
fun showMyPlus(first: Int, second: Int):Int{
    println(first)
    println(second)

    // return first + second
    fun plus(first: Int, second: Int):Int{
        return first + second
    }
    return plus(first, second)
}

fun main(array: Array<String>){
    val result = plusThree(1,2,3)
    println(result)
    val result2 = minusThree(10,1,2)
    println(result2)
    val result3 = multiplyThree()
    println(result3)
    val result4 = multiplyThree(2,2,2)
    println(result4)

    println()
    val result5 = showMyPlus(4,5)
    println(result5)
}