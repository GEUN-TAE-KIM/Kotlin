package org.cream.kotlin.Baekjoon.StepByStep.Step5

/*
TODO
 알파벳 찾기

 각 문자에 대해 배열에서 빼서 c인덱스를 계산
 이는 ASCII 코드가 97이고 알파벳 소문자에 대한 ASCII 코드가 97에서 122까지 연속적이기 때문에 작동
 */
fun main() = with(System.`in`.bufferedReader()) {

    val n = readLine()!!.trim()
    val position = mutableMapOf<Char, Int>().apply {
        ('a'..'z').forEach { put(it, -1) }
    }

    for ((i, c) in n.withIndex()) {
        if (position[c] == -1) {
            position[c] = i
        }
    }
    println(position.values.joinToString(" "))

}

fun mains() {
    val word = readLine()!!.trim()
    val positions = IntArray(26) { -1 }
    for ((i, c) in word.withIndex()) {
        val index = c - 'a'
        if (positions[index] == -1) {
            positions[index] = i
        }
    }
    println(positions.joinToString(" "))
}