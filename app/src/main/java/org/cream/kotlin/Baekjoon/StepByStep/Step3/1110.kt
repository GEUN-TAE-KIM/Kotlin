package org.cream.kotlin.Baekjoon.StepByStep.Step3

/*
TODO
 더하기 사이클
 // 몰라서 인터넷 검색해서 해결함 하...
 */
fun main() = with(System.`in`.bufferedReader()) {

    var a = readLine()!!.toInt()
    val copy = a
    var count = 0

    do {
        a = a % 10 * 10 + (a / 10 + a % 10) % 10
        count++
    } while (copy != a)
    println(count)
}