package org.cream.kotlin.Baekjoon.StepByStep.Step3

/*
TODO
 합
 n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 */

fun main() = with(System.`in`.bufferedReader()) {

    val a = readLine()!!.split(" ").map { it.toInt() }
    var b = 0

    for (i in 1..a[0]) {
        b += i
    }
    println(b)
}








