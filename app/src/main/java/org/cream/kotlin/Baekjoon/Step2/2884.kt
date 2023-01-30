package org.cream.kotlin.Baekjoon.Step2

import java.time.LocalTime

/*
TODO
 알람 시계
 */
fun main() = with(System.`in`.bufferedReader()) {

    val a = readLine()!!.split(" ").map { it.toInt() }
    val t = LocalTime.of(a[0], a[1]).minusMinutes(45)

    println("${t.hour} ${t.minute}")

}