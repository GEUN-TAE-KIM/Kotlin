package org.cream.kotlin.고급함수.수신객체가있는호출가능참조.ScopeFunction

/*
Note
 run은 확장 람다를 받는 확장함수 람다의 결과를 돌려줌

TODO
 run 과 with 함수
 */
class Address {
    var zipCode: Int = 0
    var city: String = ""
    var street: String = ""
    var house: String = ""

    fun post(message: String): Boolean {
        "Message for {$zipCode, $city, $street, $house}: $message"
        return readLine() == "OK"
    }
}

fun main1() {
    val isReceived = Address().run {
        // Address 인스턴스를 this로 사용이 가능
        zipCode = 123456
        city = "London"
        street = "Baker Street"
        house = " 221b"
        post("Hello!") // 반환값
    }

    if (!isReceived) {
        println("Message is not delivered")
    }
}

/*
Note
 with은 run과 비슷하며 차이점은 확장 함수 타입이 아니므로 문맥식을 with의 첫 번째 인자로 전달해야 함

TODO
 run 과 with 함수
 */
/*fun main() {
    val message = with(Address("London", " Baker Street", "221b")) {
        "Address: $city, $street, $house"
    }
    println(message)
}*/