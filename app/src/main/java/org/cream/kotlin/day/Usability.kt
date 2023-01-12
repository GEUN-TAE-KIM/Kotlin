package org.cream.kotlin.day

import org.cream.kotlin.클래스.Car
import kotlin.random.Random

/*
TODO
  확장 기능
 */
fun String.h1(): String {
    return "<h1>$this</h1>"
}

class Person(private val name: String, private val age: Int, val address: String) {
    fun info() = "my name is $name and age = $age"
}

fun Person.addressInfo() = "address = $address"

fun main11() {
    val name = "a"
    println(name.h1())

    val person = Person("a", 13, "BuSan")
    println(person.info())
    println(person.addressInfo())
}


/*
TODO
 when
 */
fun main12() {
    val result = when (Random.nextInt(from = 1, until = 5)) {
        1 -> {}
        2 -> {}
        3 -> {}
        else -> {
            null
        }
    }
    println(result)
}


/*
TODO
 enum class
 */
enum class Priority(val color : String) {
    LOW("Green"),
    MEDIUM("Blue"),
    HIGH("Red")
}

fun main13() {
    val priority = Priority.LOW

    for(p in Priority.values()) {
        println(p.color)
    }

    val priority2 = Priority.valueOf("MEDIUM")
    println(priority2)
}


/*
TODO
 data class
 */
data class Persons(
    val name : String,
    val age : Int
)


fun main14() {
    val person = Persons("GeunTae", 29)
}


/*
TODO
 null
 */
fun getName(name: String?) {
    println(name?.length ?: 0)
}

fun main15() {
    getName(name = "geuntae")
    getName(null)
}


/*
TODO
 제네릭
 */
fun main() {
    val car = Car(Tires(17))
    val car2 = Car("17")
    val car3 = Car(17)


    println(car.getValue())
    println(car2.getValue())
    println(car3.getValue())
}

/*
data class Tires(val size : Int)
class Car(private val tires: Tires) {
    fun getValue() = tires
}*/

data class Tires(val size : Int)
class Car<T>(private val tires: T) {
    fun getValue():T = tires
}