package org.cream.kotlin.FastCampus.Middle

fun main() {

    // 확장 함수
    // -> 기존에 정의되어 있는 클래스에 함수를 추가 하는 기능

    val test = Test()
    Test().hello()
    test.hi()

}

fun Test.hi() = println("gd")

class Test() {
    fun hello() = println("hi")
    fun bye() = println("bye")

}