package org.cream.kotlin.Baekjoon.StepByStep.Step2

/*
TODO
 사분면 고르기
 */

fun main() = with(System.`in`.bufferedReader()) {

    val a = readLine()!!.split(" ").map { it.toInt() }

    if (a[0] > 0 && a[1] > 0 ) {
        println(1)
    } else if (a[0] < 0 && a[1] > 0) {
        println(2)
    } else if (a[0] < 0 && a[1] < 0 ) {
        println(3)
    } else {
        println(4)
    }
}















