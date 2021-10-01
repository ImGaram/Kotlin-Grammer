package com.example.instruct.Kotlin

//  14.Collection
//  ->list, set, map

fun main(args: Array<String>) {

    //  값을 변경할 수 없는 콜렉션들
    //  List -> 중복 허용
    val numberList = listOf<Int>(1, 2, 3, 3, 3)   //int 만 담을 수 있는 리스트가 생성됨
    println(numberList)
    println(numberList.get(0))  //축약 가능
    println(numberList[0])  //이거도 됌
    //Set -> 동일값을 허용하지 않음
    val numberSet = setOf<Int>(1, 2, 3, 3, 3)
    println()
    //numberSet 를 모두 츨력함
    numberSet.forEach() {
        println(it)
    }
    //Map -> Key, value 방식으로 관리
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)  //key 의 타입과 value 의 타입을 같이 넣는다
    println(numberMap.get("one"))   //key 값을 넣음

    // Mutable Collection(변경가능)
    val numberList2 = mutableListOf<Int>(1, 2, 3)
    numberList2.add(3, 4)
    println()
    println(numberList2)

    val numberSet2 = mutableSetOf<Int>(1, 2, 3, 4, 4, 4)
    numberSet2.add(10)   //인덱스를 넣어줄 필여 없음
    println(numberSet2)

    val numberMap2 = mutableMapOf<String, Int>("one" to 1)  //타입 두가지 더 써주기
    numberMap2.put("two", 2)
    println(numberMap2)
}