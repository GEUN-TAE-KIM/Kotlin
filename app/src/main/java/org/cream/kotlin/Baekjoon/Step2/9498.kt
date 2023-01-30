package org.cream.kotlin.Baekjoon.Step2

/*
TODO
 시험 성적
 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 */

fun main() = with(System.`in`.bufferedReader()) {

    val a = readLine()!!.split(" ").map { it.toInt() }

    when(a[0]) {
        in 90..100 -> println("A")
        in 80..89 -> println("B")
        in 70..79 -> println("C")
        in 60..69 -> println("D")
        else -> println("F")
    }
}









