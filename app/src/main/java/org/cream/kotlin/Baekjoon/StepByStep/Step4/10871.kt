package org.cream.kotlin.Baekjoon.StepByStep.Step4

/*
TODO
 X보다 작은 수
 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 */

fun main() = with(System.`in`.bufferedReader()) {

    val n = readLine()!!.split(" ").map { it.toInt() }
    val x = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

    for (i in x) {
        if (i < n[1]) {
            print("$i ")
        }
    }

}