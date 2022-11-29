package org.cream.kotlin.고급함수.수신객체가있는호출가능참조.ScopeFunction

import java.lang.NumberFormatException

/*
Note
 확장 함수 타입의 람다를 받지 않고 인자가 하나뿐인 함수 타입의 람다를 받음
 외부 영역에 새로운 변수를 도입하는 일을 피하고 싶을 때 주로 사용

TODO
 let 함수
 */
class Address2(val city: String, val street: String, val house: String) {
    fun post(message: String) {}
}

fun main4() {
    Address2("London", "Baker Street", "221b").let {
        // 이 안에서는 it 파라미터를 통해 Address 인스턴스에 접근 가능
        println(" To city: ${it.city}")
        it.post("Hello")
    }
}

/*
Note
 let의 일반적인 사용법 중인 널이 될수 있는 값을 안전성 검사를 거쳐서 널이 될 수 없는 함수에 전달하는 용법
 널이 될 수 있는 값을 전달

TODO
 let 함수
 */
fun readInt() = try {
    readLine()?.toInt()
} catch (e: NumberFormatException) {
    null
}

fun main(args: Array<String>) {
    val index = readInt()
    val arg = if (index != null) args.getOrNull(index) else null
    // arg를 let을 쓰면 이런 코드가 됨
    val arg2 = index?.let { arg?.getOrNull(it) }
    if (arg != null) {
        println(arg)
    }
}
