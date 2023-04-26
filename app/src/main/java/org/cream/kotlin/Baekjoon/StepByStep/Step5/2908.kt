package org.cream.kotlin.Baekjoon.StepByStep.Step5

/*
TODO
 상수
*/
fun main() = with(System.`in`.bufferedReader()) {

    val (a,b) = readLine()!!.split(" ")
    val s = a.reversed().toInt()
    val d = b.reversed().toInt()

    if (s > d) {
        println(s)
    } else if (s < d) {
        println(d)
    }

}