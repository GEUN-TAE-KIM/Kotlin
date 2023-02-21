package org.cream.kotlin.Baekjoon.StepByStep.Step2

/*
TODO
 오븐 시계
 */
fun main() = with(System.`in`.bufferedReader()) {

    var (h, m) = readLine()!!.split(" ").map { it.toInt() }
    val plus = readLine()!!.toInt()

    if (m + plus >= 60) {
        h += ((m + plus) / 60)
        m = (m + plus) % 60
    } else
        m += plus
    if (h > 23) h -= 24
    println("$h $m")
}












