package org.cream.kotlin.Baekjoon.StepByStep.Step4

/*
TODO
 평균
 */

fun main() = with(System.`in`.bufferedReader()) {

    val n = readLine()!!.toDouble()
    val m = readLine()!!.split(" ").map { it.toDouble() }
    val avg = m.average() / m.max() * 100

    println(avg)

}