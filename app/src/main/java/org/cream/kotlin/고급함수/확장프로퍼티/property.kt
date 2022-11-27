package org.cream.kotlin.고급함수.확장프로퍼티

/*
Note
 이 코드는 IntRange에 대해 lefHalf라는 확장 프로퍼티를 정의
TODO
 확장 프로퍼티
me

 */
val IntRange.lefHalf: IntRange
    get() = start..(start + endInclusive) / 2

fun main1() {
    println((1..3).lefHalf)
    println((3..6).lefHalf)
}

/*
Note
 멤버와 확장 프로퍼티의 결정적인 차이는 어떤 클래스의 인스턴스에 안정적으로 상태를 추가할 방법이 없음
 확장 프로퍼티를 초기화 할수가 없음
TODO
 확장 프로퍼티
me

 */

val IntArray.midIndex
    get() = lastIndex / 2

var IntArray.midValue
    get() = this[midIndex]
set(value) {
    this[midIndex] = value
}

fun main() {
    val numbers = IntArray(6) {it * it}

    println(numbers.midValue)
    numbers.midValue *= 10
    println(numbers.midValue)
}
