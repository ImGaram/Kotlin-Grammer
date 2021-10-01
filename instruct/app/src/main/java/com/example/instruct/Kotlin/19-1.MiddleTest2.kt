package com.example.instruct.Kotlin

// 2) 이행 계좌 만들기
//      -계좌 생성 가능 (이름, 생년월일, 초기금액)
//      -잔고 확인하는 기능
//      -출금, 예금 기능

fun main(array:Array<String>){
    val account: Account= Account("홍길동","1990/03/01",1000)
    println(account.checkBalance())
    println(account.save(1000))
    println(account.withdrow(2000))
    println(account.checkBalance())
    println()
    val account2=Account("홍길동","1990/03/01",-2000)
    println(account2.checkBalance())
    val account3=Account2("홍길동", "1990/03/01")
    val account4=Account2("홍길동", "1990/03/01", 4000)
    println(account3.checkBalance())
    println(account4.checkBalance())
}

class Account{

    val name:String
    val birthbay:String
    var balance:Int
    constructor(name:String, birthbay:String, balance: Int){
        this.name=name
        this.birthbay=birthbay
        if (balance>=0){
            this.balance=balance
        }
        else{
            this.balance=0
        }
    }

    fun checkBalance():Int{
        return balance
    }
    fun withdrow(amount:Int):Boolean{
        if (balance>= amount){
            balance-=amount
            return true
        } else{
            return false
        }
    }
    fun save(amount: Int){
        balance+=amount
    }
}

//기본값 설정
class  Account2(val name:String, val birthbay:String, var balance: Int=1000){

    fun checkBalance():Int{
        return balance
    }
    fun withdrow(amount:Int):Boolean{
        if (balance>= amount){
            balance-=amount
            return true
        } else{
            return false
        }
    }
    fun save(amount: Int){
        balance+=amount
    }
}

class Account3(initialBalance:Int){

    val balance:Int = if (initialBalance>=0) initialBalance else 0

    fun checkBalance():Int{
        return balance
    }

}
