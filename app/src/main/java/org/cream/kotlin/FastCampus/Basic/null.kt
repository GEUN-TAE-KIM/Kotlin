package org.cream.kotlin.FastCampus.Basic

fun main() {

    var name : String = "d"
    var number : Int = 10

    var nickname: String? = null
    var secondNumber : Int? = null

    nickname = null
    val result = nickname ?: "no"

    println(result)
}


