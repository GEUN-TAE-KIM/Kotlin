package org.cream.kotlin.Baekjoon.StepByStep.Step5

/*
TODO
 문자열 반복
*/
fun main() = with(System.`in`.bufferedReader()) {

    val n = readLine()!!.split(" ").map { it.toInt() }

    repeat(n[0]) {
        val s = readLine()!!.toString()
        val d = readLine()!!.toInt()
        val sb = StringBuilder()

        for (i in s) {
            if (check(i)) {
                for (j in 0 until d) {
                    sb.append(i)
                }
            }
        }
        println(sb)
    }
}

fun check(c : Char): Boolean {
    val check = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./:"
    return c in check
}