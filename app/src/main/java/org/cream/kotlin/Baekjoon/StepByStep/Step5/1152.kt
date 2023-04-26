package org.cream.kotlin.Baekjoon.StepByStep.Step5

/*
TODO
 단어의 개수
*/
fun main() = with(System.`in`.bufferedReader()) {

    val n = readLine()!!.split(" ").map { it.toString() }.filter { it.isNotEmpty() }

    println(n.size)
}

