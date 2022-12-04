package org.cream.kotlin.특별한클래스.이넘클래스

/*
Note
 런타임 부가 비용이 드는 접근 방식의 클래스를 인라인 클래스를 사용함으로써 부가 비용 없이 쓸 수 있게 함

TODO
 인라인 클래스

me

 */

@JvmInline
value class Dollar(val amount: Int) {
    fun add(d:Dollar) = Dollar(amount + d.amount)
    val isDebt get() = amount < 0
}

fun main8() {
    println(Dollar(15).add(Dollar(20)).amount)
    println(Dollar(-100).isDebt )
}















