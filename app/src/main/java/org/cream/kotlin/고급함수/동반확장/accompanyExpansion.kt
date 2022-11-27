package org.cream.kotlin.고급함수.동반확장

import java.lang.IllegalArgumentException

/*
Note

TODO
 동반 확장
me

 */

fun IntRange.Companion.singletonRange(n: Int) = n..n

fun main1() {
    println(IntRange.singletonRange(5))
    println(IntRange.Companion.singletonRange(3))
    println(String.HELLO)
    println(String.Companion.HELLO)
}

val String.Companion.HELLO
    get() = "Hello"

/*
Note
 동반 객체가 존재하는 경우메나 동반객체에 대한 확장을 정의
 but) Any는 동반객체가 존재하지 않으니 불가
TODO
 동반 확장
me

 */
class Person(val firstName: String, val familyName: String) {
    companion object
}

val Person.Companion.UNKNOWN by lazy { Person("John", "Doe") }

/*
Note
 동반 객체가 존재하는 경우메나 동반객체에 대한 확장을 정의
 but) Any는 동반객체가 존재하지 않으니 불가
TODO
 람다와 수신 객체 지정 함수 타입
me
 Int.(Int) -> Int 파라미터 타입앞에 수신 객체 타입을 정의
 */

fun aggregate(numbers: IntArray, op: Int.(Int) -> Int): Int {
    var result = numbers.firstOrNull()
        ?: throw IllegalArgumentException("Empty array")

    for (i in 1..numbers.lastIndex) result = result.op(numbers[i])

    return result
}
// me 익명 함수에서도 확장 함수 문법이 가능능
fun su(numbers: IntArray) = aggregate(numbers) {op -> this + op}













