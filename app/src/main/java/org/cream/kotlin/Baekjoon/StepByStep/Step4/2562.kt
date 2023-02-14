package org.cream.kotlin.Baekjoon.StepByStep.Step4
import java.util.*
/*
TODO
 최대값
 */
fun main() =with(System.`in`.bufferedReader())  {

    val a = arrayListOf<Int>()

    for (i in 0 until 9) {
        val b = readLine()!!.toInt()
        a.add(b)
    }
    val max = Collections.max(a)
    val maxLine = a.indexOf(max)

    println(max)
    println("${maxLine + 1}")
}