package org.cream.kotlin.Baekjoon.StepByStep.Step4

/*
TODO
 평균은 넘겠지
NOTE
 공백 처리 하기
 */

inline fun <reified T> removeItem(array: Array<T>, value: T) : Array<T> {
    return array.filter {it != value}.toTypedArray()
}

fun main() = with(System.`in`.bufferedReader()) {

    val c = readLine()!!.split(" ").map { it.toInt() }

    repeat(c[0]) {

        var array = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()

        val value = array[0]

        array = removeItem(array, value)

        var count = 0.0

        for (element in array){
            if (element > array.sum()/value){
                count += 1
            }
        }
        println(String.format("%.3f",(count/value*100))+"%")

    }

}