package com.example.instruct.Kotlin

//  18.Class
//  OOP -> Object Oriented Programming (객체 지향 프로그래밍)
//  객체란 무엇일까?
//  - 이름이 있는 모든 것
//   절차 지향 프로그래밍 문제 해결 방법
//  - 코드를 위에서부터 아래쪽으로 실행함
//  객체 지향 프로그래밍 문제 해결 방법
//  - 객체를 만들어 객체에게 일을 시켜 문제 해결
//  - 선수, 심판, 관중, 경기장 -> 축구 게임
//  객체를 만드는 방법
//  -설명서가 필요함

fun main(array: Array<String>) {

    //클래스를 통해서 실제 만들기(인스턴스(객체)화)
    Car("v8 engine", "big")
    val bigCar = Car("v8 engine", "big")
    val bigCar1: Car = Car("v8 engine", "big")  //클래스는 자료형이 됨

    val SuperCar: SuperCar = SuperCar("good engine", "big", "white")    //construct 로 들어옴

    //인스턴스가 가지고 있는 기능 사용 방법
    val runableCar: RunableCar = RunableCar("smple engine", "short body")
    //RunableCar.ride() -> 불가능!(설명서 RunableCar는 설명 서라 기능이 없음!)
    runableCar.ride()
    runableCar.navi("광주")
    runableCar.drive()

    //인스턴스의 멤버 변수에 접근하는 방법
    val runableCar2: RunableCar2 = RunableCar2("nice engine", "long body")
    println(runableCar2.body)    //객체에 접근하고 싶을 때 찍는 .
    println(runableCar2.engine)

    println()
    val testClass = TestClass()
    testClass.testClass(1)
    testClass.testClass(1,2)
}

//  클래스 만드는 방법(1)
class Car(var engine: String, var body: String) {   //함수 만드는 방법과 비슷

}

//  클래스 만드는 방법(2)
class SuperCar {
    var engine: String
    var body: String
    var door: String

    constructor(engine: String, body: String, door: String) {    //함수와 같음
        this.engine = engine    //SuperCar 의 설명서 역할
        this.body = body
        this.door = door

    }
}

//  클래스를 만드는 방법(3) -> 1번 방법의 확장
class Car1 constructor(engine: String, body: String) {
    var door: String = ""

    //생성자 constructor
    constructor(engine: String, body: String, door: String) : this(engine, body) {  //Car1 = this
        this.door = door
    }
}

//  클래스 만드는 방법(4) -> 2번 확장
class Car2 {
    var engine: String = ""
    var body: String = ""
    var door: String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

//  클래스 사용법(1)
class RunableCar(engine: String, body: String) {    //클래스의 기능을 추가하려면 클래스에 함수를 넣어라

    fun ride() {
        println("탑승 하였습니다")
    }

    fun drive() {
        println("달립니다!")
    }

    fun navi(destination: String) {
        println("$destination 으로 목적지가 설정되었습니다") //출력 $?
    }
}

class RunableCar2 {
    var engine: String
    var body: String

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    init {  //가장 먼저 출력되는 부분(무조건 호출)
        //  초기세팅에 유용하다
        println("RunableCar2 가 만들어 졌습니다")
    }

    fun ride() {
        println("탑승 하였습니다")
    }

    fun drive() {
        println("달립니다!")
    }

    fun navi(destination: String) {
        println("$destination 으로 목적지가 설정되었습니다") //출력 $?
    }
}

//오버로딩(클래스 5)
// -> 이름이 같지만 받는 매개변수가 다른 함수
class TestClass(){

    //구분할수 있는 클래스들
    fun testClass(a: Int){
        println("up")
    }

    fun testClass(a:Int, b:Int){
        println("down")
    }
}