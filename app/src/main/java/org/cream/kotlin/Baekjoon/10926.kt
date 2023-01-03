package org.cream.kotlin.Baekjoon

import java.util.*

/*
TODO
 준하는 사이트에 회원가입을 하다가 joonas라는 아이디가 이미 존재하는 것을 보고 놀랐다.
 준하는 놀람을 ??!로 표현한다.
 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때, 놀람을 표현하는 프로그램을 작성하시오.
 */
fun main() {
    val scan = Scanner(System.`in`)
    val a = scan.nextLine()
    val b = "??!"
    println(a + b)
}

/*
ME
 엥? 머지 이건 왜 되지 설마 파라미터에 args를 넣어야 readLine으로 백준 프로그램이 인식해서 가능한건가 음...
 */
fun main1(args: Array<String>) {
    val a = readLine()!!.toString()
    println("$a??!")
}