package org.cream.kotlin.Baekjoon.StepByStep.Step4

/*
TODO
 나머지
 */

fun main() = with(System.`in`.bufferedReader()) {

    val s = 42
    val e = arrayListOf<Int>()

    for (i in 1..10) {
        val a = readLine()!!.toInt()

        val d = a % s

        e += d
    }
    val o = e.distinct()
    println(o.size)

}