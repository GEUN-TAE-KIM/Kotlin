package org.cream.kotlin.Baekjoon

import java.util.*

/*
TODO
 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
 */
fun main() {
    val scan = Scanner(System.`in`)
    val a = scan.nextInt()
    val b = scan.nextInt()

    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b)
    println(a % b)

    val c = readLine()!!.split(" ").map { it.toInt() }
    println(c[0]+c[1])
}