package org.cream.kotlin.Baekjoon.StepByStep.Step3

/*
TODO
 빠른 A+B
 */
fun main() = with(System.`in`.bufferedReader()) {

    val a = readLine()!!.toInt()
    val arr = ArrayList<Int>()
    repeat(a) {
        val input = readLine()!!.split(" ").map { it.toInt() }
        arr.add(input[0] + input[1])
    }
    println(arr.joinToString("\n"))
}