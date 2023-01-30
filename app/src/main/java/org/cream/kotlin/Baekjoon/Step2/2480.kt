package org.cream.kotlin.Baekjoon.Step2

/*
TODO
 주사위 세개
 */
fun main() = with(System.`in`.bufferedReader()) {

    val a = readLine()!!.split(" ").map { it.toInt() }

    val list = ArrayList<Int>()
    list.add(a[0])
    list.add(a[1])
    list.add(a[2])

    val max = list.max()

    if (a[0] == a[1] && a[0] == a[2] && a[1] == a[2]) {
        println(10000 + a[0] * 1000)
    } else if (a[0] == a[1] || a[0] == a[2]) {
        println(1000 + a[0] * 100)
    } else if (a[1] == a[2]) {
        println(1000 + a[1] * 100)
    } else  {
        println(max * 100)
    }
}