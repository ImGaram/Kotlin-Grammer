package com.example.instruct.Kotlin

// 23 접근 제어자

fun main(array:Array<String>) {
    // private 는 클래스 외부에서 그 기능을 사용할 수 없게 한다
    val testAccess: TestAccess = TestAccess("이무개")
    testAccess.test()   // 클래스 안에 함수를 사용할 땐 ()가 필요함
//    println(testAccess.name)
//    testAccess.name = "이무개 2"
//    println(testAccess.name)

    val reward: Reward = Reward()
    reward.rewardAmount = 2000

    val runningCar: RunningCar =RunningCar()
    runningCar.runFast()
//    runningCar.run()
}

class Reward() {
    var rewardAmount: Int =1000
}

class TestAccess {
    // private = 외부에서 접근 불가능
    private var name: String = "홍길동"

    constructor(name: String){
        this.name = name
    }

    // private 는 내부 수정은 가능(클래스 안)
    fun changeName(newName: String){
        this.name = newName
    }

    fun test() {
        println("테스트")
    }
}

class RunningCar() {
    fun runFast() {

    }

    // 외부에 공개하고 싶지 않은 클래스를 만들때
    // 외부 내부 단절절
    private fun run() {

    }
}
