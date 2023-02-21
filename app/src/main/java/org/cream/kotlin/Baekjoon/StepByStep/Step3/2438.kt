package org.cream.kotlin.Baekjoon.StepByStep.Step3

/*
TODO
 별 찍기 - 1
 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 */

fun main() = with(System.`in`.bufferedReader()) {

    val a = readLine()!!.split(" ").map { it.toInt() }
    val b = "*"

    for (i in 1..a[0]) {
        for (j in 2..i) {
            print(b)
        }
        println(b)
    }
}