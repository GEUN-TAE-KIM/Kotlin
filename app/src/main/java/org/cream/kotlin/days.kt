package org.cream.kotlin.특별한클래스.이넘클래스

import java.io.BufferedWriter
import java.io.OutputStreamWriter

// 특정 문자 기준으로 문자열 분리 실시
fun mainQ() {
    var str = "sad,asd,asdss"
    var ds = str.split(",")
    println(ds)

    for (i in ds.indices step(1)) {
        var idx = i.toString()
        println(idx + " : " + ds.get(i))
    }

}


/*
TODO
 입력
*/
fun mainW() = with(System.`in`.bufferedReader()) {

    // 정수 하나 읽기
    val num = kotlin.io.readLine()!!.toInt()

    // 공백 기준으로 읽기
    val nums = kotlin.io.readLine()!!.split(" ").map { it.toInt() }

    // 문자열 을 char 배열로 받기
    val char = kotlin.io.readLine()!!.toCharArray()

}

/*
TODO
 출력
*/
fun mainE() = with(System.`in`.bufferedReader()) {

    // 기본
    print("hello")

    // bufferedWriter
    val sout = BufferedWriter(OutputStreamWriter(System.out))
    sout.appendLine()
    sout.flush()
    sout.close()

    // 더 짧은 bufferedWriter
    val bw = System.out.bufferedWriter()

    //템플릿
    val s = "abc"
    println("$s.length is ${s.length}") // prints "abc.length is 3"
}








