package org.cream.kotlin.특별한클래스.이넘클래스

import java.time.LocalTime
import java.util.*
import kotlin.collections.ArrayList

/*
TODO
 14681
 */
fun main14681() {
    val scan = Scanner(System.`in`)

    val a = scan.nextInt()
    val b = scan.nextInt()

    if (a > 0 && b > 0) {
        println(1)
    } else if (a < 0 && b > 0) {
        println(2)
    } else if (a < 0 && b < 0) {
        println(3)
    } else {
        println(4)
    }
}

/*
TODO
 2884
 */
fun main2884() {
    val scan = Scanner(System.`in`)

    val a = scan.nextInt()
    val b = scan.nextInt()

    if (b - 45 >= 0) {
        print("$a ${b - 45}")
    } else {
        if (a == 0) print("23 ${b + 15}")
        else print("${a - 1} ${b + 15}")
    }
}

/*
TODO
 2525
 */
fun main2525() {

    val scan = Scanner(System.`in`)

    var a = scan.nextInt()
    var b = scan.nextInt()
    val c = scan.nextInt()

    val sum = b + c

    a += sum / 60
    b += c - 60 * (sum / 60)

    if (a >= 24) a -= 24

    println("$a $b")

}




















