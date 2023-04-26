package org.cream.kotlin.Baekjoon.StepByStep.Step1

/*
TODO
 꼬마 정민
 */
fun main() = with(System.`in`.bufferedReader()) {

    val n = readLine()!!.split(" ").map { it.toLong() }

    val s = n[0] + n[1]+ n[2]

    println(s)
}