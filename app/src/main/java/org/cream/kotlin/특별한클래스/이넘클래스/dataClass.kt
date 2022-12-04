package org.cream.kotlin.특별한클래스.이넘클래스

import kotlin.random.Random

/*
Note
 컴파일러가 주생성자에 프로퍼티 값을 서로 비교하는 연상을 자동으로 생성해줘서 두 비교가 true로 반환

TODO
 데이터 클래스

me
 data를 없애면 프로퍼티 비교가 아니라 객체의 정체성에 따라 결정되서 결과가 바뀜
 */
data class Person(val firstName: String, val familyName: String, val age: Int)

fun main5() {
    val person1 = Person("John", "Doe", 25)
    val person2 = Person("John", "Doe", 25)
    val person3 = person1

    println(person1 == person2)
    println(person1 == person3)
}

/*
Note
 주 생성자의 파라미터에서 선언한 프로퍼ㅣ만 equals()/hashCode()/toString() 메서드 구현에 쓰임
 다른 프로퍼티들은 이런 함수들의 생성에 영향을 미치지 못함

TODO
 데이터 클래스
 */
data class Person1(val firstName: String, val familyName: String) {
    var age = 0
}

fun main6() {
    val person1 = Person1("John", "Doe").apply { age = 25 }
    val person2 = Person1("John", "Doe").apply { age = 26 }

    println(person1 == person2)
}

/*
Note
 데이터 클래스를 각각의 프로퍼티에 대응하는 지역 변수를 정의하는 좀더 간결한 구문을

TODO
 구조 분해 선언

me
 데이터 클래스는 선언하기만 하면 자동으로 구조 분해를 지원 일반적으로 아무 타입에 사용이 가능`
 */
fun newPerson() = Person(readLine()!!, readLine()!!, Random.nextInt(100))

fun main7() {
    val person = newPerson()
    val firstName = person.firstName
    val familyName = person.familyName
    val age = person.age

    if (age < 18) {
        println("$firstName $familyName is nuder age")
    }

    // 구조 분해 선언
    val (firstName1, familyName2, age3) = Person("j","d",25)
}
















