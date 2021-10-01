package com.example.instruct.Kotlin

import java.util.*

// 1) 사칙 연산을 수행하는 클래스

//  3) TV클래스
//      -on off 기능
//      -채널 올라가, 내리기
//      -초기 채널은 (S사 M사 K사 3개)

fun main(array:Array<String>){
    val calculator1=Calculator1()
    println(calculator1.plus(4,5))
    println(calculator1.minus(4,5))
    println(calculator1.mul(4,5))
    println(calculator1.div(4,5))
    println()
    val calculator2=Calculator2()
    println(calculator2.plus(1,2,3,4,5))
    println(calculator2.minus(10,1,2,3))
    println(calculator2.multyply(1,2,3))
    println(calculator2.divide(10,2,3))
}

// 가장 쉬움
class Calculator1(){
    fun plus(a:Int, b:Int):Int{
        return a+b
    }

    fun minus(a:Int, b:Int):Int{
        // 먼저 들어온 수에서 뒤에 들어온 수에서 뺌
        return a-b
    }

    fun mul(a:Int, b:Int):Int{
        return a*b
    }

    fun div(a:Int, b:Int):Int{
        // 먼저 들어온 수에서 뒤에 들어온 수를 나눔
        // 리턴은 몫만
        return a/b
    }
}

class Calculator2(){
    fun plus(vararg numbers:Int): Int {
        var res:Int=0
        numbers.forEach {
            res+=it
        }
        return res
    }

    fun minus(vararg numbers:Int): Int {
        var res:Int=numbers[0]
        for (i in 0 until numbers.size){
            if(i!=0){
                res-=numbers[i]
            }
        }
        return res
    }

    fun multyply(vararg numbers:Int):Int{
        var res:Int=1
        numbers.forEach {
            if (it!=0) {
                res *= it
            }
        }
        return res
    }

    fun divide(vararg numbers:Int):Int{
        var res:Int=numbers[0]
        numbers.forEachIndexed { index, value ->
            //10 -> 10/10/2/3
            if (index!=0){
                if (value!=0){
                    res/=value
                }
            }
        }
        return res
    }
}