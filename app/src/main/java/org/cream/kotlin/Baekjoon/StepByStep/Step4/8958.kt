package org.cream.kotlin.Baekjoon.StepByStep.Step4

/*
TODO
 OX퀴즈
 */

fun main() = with(System.`in`.bufferedReader()) {

    val n = readLine()!!.toInt()

    repeat(n) {
        val ox = readLine()!!.toString().split("")
        var score = 0
        var sum = 0

        ox.forEach {
            if (it == "O") {
                sum += 1 + score
                score++
            } else {
                score = 0
            }
        }
        println(sum)
    }
}


