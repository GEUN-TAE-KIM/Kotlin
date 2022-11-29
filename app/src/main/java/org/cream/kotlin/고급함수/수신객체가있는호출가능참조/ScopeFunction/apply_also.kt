package org.cream.kotlin.고급함수.수신객체가있는호출가능참조.ScopeFunction

/*
Note
 apply는 확장 람다를 받는 확장 함수이고 자신의 수신 객체를 반환
 run과 달리 반환값을 만들어 내지 않고 객체의 상태를 설정하는 경우 사용

TODO
 apply/also 함수
 */
class Address3 {
    var city: String = ""
    var street: String = ""
    var house: String = ""

    fun post(message: String) {}
}

fun main5() {
    val messaga = readLine() ?: return

    Address3(). apply {
        city = "London"
        street = "Baker Street"
        house = "221b"
    }.post(messaga)
}

/*
Note
 also 는 인자가 하나 있는 람다를 파라미터로 받음

TODO
 apply/also 함수
 */
fun main() {
    val messaga = readLine() ?: return

    Address3().also {
        it.city = "London"
        it.street = "Baker Street"
        it.house = "221b"
    }.post(messaga)
}