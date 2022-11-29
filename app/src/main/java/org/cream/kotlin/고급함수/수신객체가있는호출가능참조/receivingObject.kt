package org.cream.kotlin.고급함수.수신객체가있는호출가능참조

import java.lang.IllegalArgumentException

/*
Note
 수신 객체가 있는 함숫값을 정의하는 호출 가능 참조를 만들 수 있음

TODO
 수신객체가있는호출가능참조

me
 수신 객체가 없는 호출 가능 참조를 수신 객체가 필요한 함수 타입의 값 대신 사용
 -> Int.(Int) -> Int의 고차 함수에 인자가 두 개인 호출 가능 참조인 max::를 전달해도 되고
   역방향 대입도 가능
 */
fun aggregate(numbers: IntArray, op: Int.(Int) -> Int): Int {
    var result = numbers.firstOrNull()
        ?: throw IllegalArgumentException("Empty array")

    for(i in 1..numbers.lastIndex) result = result.op(numbers[i])

    return result
}

fun Int.max(other:Int) = if (this > other) this else other


fun main1() {
    val numbers = intArrayOf(1, 2, 3, 4)
    println(aggregate(numbers, Int::plus))
    println(aggregate(numbers, Int::max))
}