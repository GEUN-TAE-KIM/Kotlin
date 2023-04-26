package org.cream.kotlin.FastCampus.Basic

fun main() {
    max(10, 5)
    isHoliday("금요일 좋아")
}

fun max(a: Int, b: Int) {

    val result =
        if (a > b) {
            println(a)
        } else {
            println(b)
        }

    println(result)

}

fun isHoliday(dayOfWeek: String) {

    val result = when (dayOfWeek) {
        "토",
        "일",
        -> false
        else -> true
    }

    println(result)

}


