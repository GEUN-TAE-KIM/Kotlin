package org.cream.kotlin.Baekjoon.StepByStep.Step3

/*
TODO
 영수증
 */

fun main() = with(System.`in`.bufferedReader()) {

    val a = readLine().toInt()
    val b = readLine().toInt()
    var e = 0

    for (i in 1..b) {
        val c = readLine().toInt()
        val d = readLine().toInt()
        val f = c * d

        e += f
    }

    if (a == e) {
        println("Yes")
    } else {
        println("No")
    }

}