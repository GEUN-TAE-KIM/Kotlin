package org.cream.kotlin.FastCampus.Basic

fun main() {
    val user = User("김근태", 29)

    println(user.name)

    val kid = Kid("건담", 300, "male")
    println(kid)
}

open class User(open val name : String, open var age: Int)

class Kid constructor(override val name: String, override var age: Int) : User(name, age) {
    var gender: String = "female"

    init {
        println("초기화 중")
    }

    constructor(name: String, age:Int, gender: String) : this(name, age) {
        this.gender = gender
        println("부 생성자 호출")
    }

}
