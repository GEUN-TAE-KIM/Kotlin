package org.cream.kotlin.Baekjoon.StepByStep.Step5

/*
TODO
 숫자의 합
 */
fun main() = with(System.`in`.bufferedReader()) {

    val n = readLine()!!.toInt()
    var sum = 0
    var d = ""

    repeat(n) {
        d += readLine()!!
    }
    for (i in d) {
        sum += i.toString().toInt()
    }
    println(sum)
}
