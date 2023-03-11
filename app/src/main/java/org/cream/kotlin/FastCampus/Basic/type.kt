package org.cream.kotlin.FastCampus.Basic

fun main() {
    println(check("안녕"))
    println(check(3))
    println(check(true))

    println(cast("d"))
    println(cast(1))

    println(smartCast("d"))
    println(smartCast(2))
}

fun check(a: Any): String {

    return when (a) {
        is String -> {
            "문자열"
        }
        is Int -> {
            "숫자"
        }
        else -> {
            "?"
        }
    }
}

fun cast(a: Any) {
    val result = (a as? String) ?: "몰라영"
    println(result)
}

fun smartCast(a: Any): Int {

    return when (a) {

        is String -> {
            a.length
        }
        is Int -> {
            a.dec()
        }
        else -> {
            -1
        }
    }
}

