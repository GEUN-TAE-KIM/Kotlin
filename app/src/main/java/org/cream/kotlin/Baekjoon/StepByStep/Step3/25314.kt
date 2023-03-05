package org.cream.kotlin.Baekjoon.StepByStep.Step3

/*
TODO
 코딩은 체육과목 입니다
 */
fun main() = with(System.`in`.bufferedReader()) {

    val n = readLine()!!.split(" ").map { it.toLong() }

    val long = "long"
    val int = "int"

    for (i in 0..n[0]) {

        if (i < n[0] / 4) {
            println(long)
        }

        if (i == n[0])
            println(int)
    }
}