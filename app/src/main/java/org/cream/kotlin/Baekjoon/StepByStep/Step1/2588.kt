package org.cream.kotlin.Baekjoon

import java.util.*

/*
TODO
 (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

 입력
 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
 */

fun main() {
    val scan = Scanner(System.`in`)

    val a = scan.nextInt()
    val b = scan.nextInt()

    println(a * (b % 10))
    println(a * (b % 100 / 10))
    println(a * (b / 100))
    println(a * b)
}











