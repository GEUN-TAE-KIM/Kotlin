package org.cream.kotlin.Baekjoon.StepByStep.Step5

/*
TODO
 문자열
 */
fun main() = with(System.`in`.bufferedReader()) {

    val b = readLine()!!.toInt()

    repeat(b) {
        val n = readLine()!!.toString()
        println("${n.first()}${n.last()}")
    }
}