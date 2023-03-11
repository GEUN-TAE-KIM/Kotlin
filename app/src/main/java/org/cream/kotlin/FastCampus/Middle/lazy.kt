package org.cream.kotlin.FastCampus.Middle

lateinit var text : String
val test : Int by lazy {
    println("초기화 중")
    100
}

fun main() {

    text = "name"

    println("메인 함수 실행")
    println("초기화 한 값 $test")
    println("두번째 호출 $test")
}