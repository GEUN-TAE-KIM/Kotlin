package org.cream.kotlin.Baekjoon.StepByStep.Step3

import java.util.*

/*
TODO
 A+B - 7
 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */

fun main() {

    val scan = Scanner(System.`in`)

    val a = scan.nextInt()

    for (i in 1..a) {
        val b = scan.nextInt()
        val c = scan.nextInt()
        val x = b + c
        println("Case #$i: "+"$x" )
    }

}