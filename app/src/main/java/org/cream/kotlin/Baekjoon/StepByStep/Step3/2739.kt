package org.cream.kotlin.Baekjoon.StepByStep.Step3

/*
TODO
 구구단
 N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
 */

fun main() = with(System.`in`.bufferedReader()) {

    val a = readLine()!!.split(" ").map { it.toInt() }.toMutableList()

    for (i in 1..9) {
        println("${a[0]} * $i = ${a[0] * i}")
    }

}