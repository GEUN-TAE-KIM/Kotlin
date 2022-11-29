package org.cream.kotlin.고급함수.확장함수

/*
Note
 어떤 클래스의 멤버인 것처럼 호출 할수 있는 함수 ( 실제 멤버 x )
TODO
 확장 함수
me
 확장 함수는 일반 함수를 클래스 멤버 인 것 처럼 쓰게 하는 문법
 */

fun String.truncate(maxLength: Int): String {
    return if (length <= maxLength) this else substring(0, maxLength)
}

fun main1() {
    println("Hello".truncate(10))
    println("Hello".truncate(3))
}