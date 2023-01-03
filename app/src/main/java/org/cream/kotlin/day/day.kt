package org.cream.kotlin.day

import java.util.*

/*
TODO
 변수
 */
fun main1() {

    val scan = Scanner(System.`in`)
    val a = scan.nextDouble()
    val b = scan.nextDouble()
    println(a / b)

}

/*
TODO
 함수
 */
fun main2() {
    val result = plus(7, 3)
    println(result)
}

fun plus(a: Int, b: Int): Int {
    return a + b
}

/*
TODO
 기본 인수
 */
fun minus(a: Int = 5, b: Int = 2) = a - b

fun main() {
    val result = minus(a = 10)
    println(result)
}










