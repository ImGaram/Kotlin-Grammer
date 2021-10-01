package com.example.instruct.Kotlin

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main(array: Array<String>) {

    val a = mutableListOf<Int>(1, 2, 3)
    a.add(4)    //원래 수에 4 추가
    println(a)
    a.add(0, 100)    //0번째 자리에 100이 들어가고 나머지는 한칸씩 밀림
    println(a)  //[100, 1, 2, 3, 4]
    a.set(0, 200)   //set = 0번째 값을 200으로 바꿈
    println(a)
    a.removeAt(1)   //1번째 인덱스를 지운다
    println(a)

    val b = mutableSetOf<Int>(1, 2, 3, 4)
    b.add(2)    //중복을 허용하지 않음
    println(b)
    b.remove(2)
    println(b)
    b.remove(100)   //없는 값은 따로 작업을 하지 않는다
    println(b)

    val c = mutableMapOf<String, Int>("one" to 1)
    c.put("two", 2) //값 추가
    println(c)
    c.replace("two", 3) //해당되는 value 의 값 변경
    println(c)
    println(c.keys) //키만 출력
    println(c.values)
    c.clear()   //전부 지워줌
    println(c)
}