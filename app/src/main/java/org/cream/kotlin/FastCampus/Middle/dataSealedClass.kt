package org.cream.kotlin.FastCampus.Middle

fun main() {
    val person = Person("rmsxo", 29)
    val dog = Dog("tlqkrus", 24)

    println(person.toString())
    println(dog.toString())
    println(dog.copy(age = 3).toString())

    val cat : Cat = BlueCat()
    val result = when(cat) {
        is BlueCat -> {"blue"}
        is RedCat -> {"red"}
        is GreenCat -> {"green"}
        is WhiteCat -> "white"
    }

    println(result)
}

class Person(
    val name: String,
    val age: Int,
)

// toString(), hashCode(), equals(), copy() 메서드를 자동으로 생성
data class Dog(
    val name: String,
    val age: Int,
)

// Sealed Class

sealed class Cat
class BlueCat : Cat()
class RedCat : Cat()
class GreenCat : Cat()
class WhiteCat : Cat()







