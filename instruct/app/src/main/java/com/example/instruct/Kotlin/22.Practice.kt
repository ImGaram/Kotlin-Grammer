package com.example.instruct.Kotlin

fun main() {
    val night =  Night(20,4)
    val monster = Monster(15,5)

    night.attack(monster)
    monster.attack(night)

    // 기사의 체력을 임의로 바꾼다 -> private 로 해결
//    night.hp = 100
//    println(night.hp)
}

// 자주 사용해 습관 들이자 (중요함), 필요할 때만 늘리기
class Monster2(private var hp: Int, private val power: Int){
    private fun attack() {

    }
}

class Night(private var hp: Int, private var power: Int) {
    fun attack(monster: Monster) {
        monster.defense(power)
    }
    fun defense(damage: Int) {
        hp -= damage
        if (hp > 0) {
            heal()
            println("기사의 체력 $hp 입니다")
        }
        else println("기사가 죽었습니다")
    }
    private fun heal() {
        // 아무때나 사용하는게 아니라 공격을 당했을때 hp를 회복함 -> private 로 해결
        hp+=3
    }
}

class Monster(private var hp: Int, private var power: Int) {
    fun attack(night: Night) {
        night.defense(power)
    }
    fun defense(damage: Int) {
        hp -= damage
        if (hp > 0) println("괴물의 체력 $hp 입니다")
        else println("괴물이 죽었습니다")
    }
}
