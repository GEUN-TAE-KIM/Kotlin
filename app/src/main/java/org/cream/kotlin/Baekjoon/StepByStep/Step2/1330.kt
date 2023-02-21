package org.cream.kotlin.Baekjoon.StepByStep.Step2

/*
TODO
 두 수 비교하기
 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.

 --흠...리드라인 하...
 */

fun main() {

    val a = readLine()!!.split(" ").map { it.toInt() }

    if (a[0] > a[1]) {
        println(">")
    } else if (a[0] < a[1]) {
        println("<")
    } else if (a[0] == a[1]) {
        println("==")
    }

}













