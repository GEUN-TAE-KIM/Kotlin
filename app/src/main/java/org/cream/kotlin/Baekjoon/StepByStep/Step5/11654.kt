package org.cream.kotlin.Baekjoon.StepByStep.Step5

/*
TODO
 아스키 코드
 */
fun main() = with(System.`in`.bufferedReader()) {

    val n = readln().toCharArray()
    val s = readLine()

    println(n[0].code)
    println(s[0].toInt())
}