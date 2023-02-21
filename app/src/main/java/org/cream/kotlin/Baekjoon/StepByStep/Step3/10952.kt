package org.cream.kotlin.Baekjoon.StepByStep.Step3

import java.util.*

/*
TODO
 A+B - 5
 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */

fun main(){

    val scan = Scanner(System.`in`)

    while (true) {
        val b = scan.nextInt()
        val c = scan.nextInt()
        if (b == 0 && c == 0) break
        println(b+c)
    }
}