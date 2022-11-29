package org.cream.kotlin.고급함수.수신객체가있는호출가능참조

/*
Note
 확장 정의의 수신 객체 타입의 인스턴스 = 확장 수신 객체(extension receiver)
 확장이 포함된 클래스 타입의 인스턴스 = 디스패치 수신 객체(dispatch receiver)
 두 수신객체를 가리킬 때는 this 앞에 클래스 이름이나 확장 이름을 붙여서 한정

TODO
 클래스 멤버인 확장
 */
class Address(val city: String, val street: String, val house: String)

class Person(val firstName : String, val familyName: String) {
    fun Address.post(message: String) {

        // 암시적 this: 확장 수신객체(Address)
        val city = city

        // 한정 시키지 않은 this: 확장 수신객체(Address)
        val street = this.city

        // 한정시킨 this: 확장 수신객체(Address)
        val house = this@post.house

        // 암시적 this: 디스패치 수신 객체(Person)
        val firstName = firstName

        // 한정시킨 this: 디스패치 수신 객체(Person)
        val familyName = this@Person.familyName

        println("From $firstName, $familyName at $city, $street, $house:")
        println(message)
    }

    fun test(address: Address) {
        // 디스패치 수신 객체: 암시적
        // 확장 수신 객체: 명시적
        address.post("Hello")
    }
}