package org.cream.kotlin.고급함수.수신객체가있는호출가능참조.ScopeFunction

/*
Note
 문맥 식이 없고 람다의 값을 반환하기만 함

TODO
 문맥이 없는 run
 */
class Address1(val city: String, val street: String, val house: String) {
    fun asText() = "$city, $street, $house"
}

fun main3() {
    val address = run {
        val city = readLine() ?: return
        val street = readLine() ?: return
        val house = readLine() ?: return
        Address1(city, street, house)
    }
    println(address.asText())
}