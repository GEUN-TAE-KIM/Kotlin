package org.cream.kotlin.Baekjoon.StepByStep.Step4

import java.util.*
import kotlin.random.Random

/*
TODO
 개수 세기
 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
 */

fun main() = with(System.`in`.bufferedReader()) {

    val n = readLine()!!.toInt()
    val list = readLine()!!.split(" ").map { it.toInt() }
    val v = readLine()!!.toInt()

    var x = 0

    for (i in list) {
        if (i == v) {
            x++
        }
    }
    println(x)
}
