package org.cream.kotlin.Baekjoon.StepByStep.Step4

/*
TODO
 최소, 최대
 N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 */

fun main() =with(System.`in`.bufferedReader())  {

    val n = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()

    for (i in n) {
        if (i == a.size) {
            val e = a.min()
            val d = a.max()
            print("$e $d")
        }
    }
}