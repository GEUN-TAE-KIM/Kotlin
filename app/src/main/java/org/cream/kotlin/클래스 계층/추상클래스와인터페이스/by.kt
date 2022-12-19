package org.cream.kotlin.클래스

/*
Note
 이미 있는 인스턴스를 재사용 하는 것

TODO
 위임

me
 객체 합성과 상속의 이점을 살릴 수 있음 합성 같은 것
 */
interface PersonData {
    val name: String
    val age: Int
}

open class Persons(override val name: String, override val age: Int): PersonData

class Alias(private val realIdentity: PersonData, private val newIdentity: PersonData) :
    PersonData by newIdentity {
    override val age: Int
        get() = realIdentity.age
}

fun main() {
    val valWatts = Persons("Val watts", 30)
    val johnDoe = Alias(valWatts, Persons("john na", 25) )
    println(johnDoe.age)
}