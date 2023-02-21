package org.cream.kotlin.Baekjoon.StepByStep.Step4

/*
TODO
 과제 안 내신 분..?
 */
fun main() = with(System.`in`.bufferedReader()) {

    val list = BooleanArray(31)

    for(i in 1..28) {
        list[readLine().toInt()] = true
    }

    for(i in 1..30) {
        if (!list[i])
            println(i)
    }
}