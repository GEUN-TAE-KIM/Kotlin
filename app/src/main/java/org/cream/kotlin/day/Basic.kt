package org.cream.kotlin.day

import java.util.*

/*
TODO
 변수
 */
fun main1() {

    val scan = Scanner(System.`in`)
    val a = scan.nextDouble()
    val b = scan.nextDouble()
    println(a / b)

}

/*
TODO
 함수
 */
fun main2() {
    val result = plus(7, 3)
    println(result)
}

fun plus(a: Int, b: Int): Int {
    return a + b
}

/*
TODO
 기본 인수
 */
fun minus(a: Int = 5, b: Int = 2) = a - b

fun main3() {
    val result = minus(a = 10)
    println(result)
}

/*
TODO
 if문
 */
fun ageRestriction(age: Int) {
    if (age < 18) println("낮음")
    if (age > 18) println("높음")
    if (age == 18) println("같음")
    if (age > 18 || age == 18) println("우왕")
}

fun ageRestriction2(age2: Int) : String {

   return if (age2 > 18) {
       "힝"
   } else if (age2 < 18) {
       "힝2"
   } else {
       "후"
   }
}

fun main4() {
    ageRestriction(19)
    val a = ageRestriction2(17)
    println(a)
}


/*
TODO
 문자열
 */
fun main5() {
    val number = 10
    val strings = "굿 ${number.toDouble()}"
    println(strings)
    ages(25)
}

fun ages(age:Int) {
    println(if (age < 30) "높거나" else "낮거나")
}


/*
TODO
 while 반복문
 */
fun main6() {
    var number = 0
    while (condition(number = number)) {
        println(number)
        number++
    }
    println(condition2())
}

fun condition(number : Int): Boolean {
    return number <= 10
}

fun condition2() {
    var number2 = 100
    // 거짓이여도 첫 객체는 출력이 된다
    do {
        println(number2)
        number2 += 10
    }
    while (condition(number = number2))
}

/*
TODO
 for 반복문
 */
fun main() {
    val a = listOf("a","b")
    for (e in a) {
        println(a)
    }
}