package org.cream.kotlin.고급함수.확장함수

/*
Note
 확장 함수 자체는 수신 객체가 속한 타입의 캡슐화{}를 깰 수 없음 밖에서 선언 불가
 */

class Person(val name: String, private val age: Int) {

fun Person.showInfo() = println(" $name, $age") }

/*
Note
 일반 클래스 멤버와 비슷하게 바인딩된 호출 가능
 */

fun Person.hasName(name : String) = name.equals(this.name, ignoreCase = true)

fun main2() {
    val f = Person("John", 25)::hasName
    println("JOHN")
    println("JAKE")
}

/*
Note
 클래스 멤버와 확장의 시그니처가 같다면 클래스 멤버를 우선 한다.

 */

class Person1(val firstName: String, val familyName: String) {
    fun fullName() = "$firstName $familyName"
}

fun Person1.fullName() = "$familyName $firstName"

fun main3() {
    println(Person1("John", "doe").fullName())
}


/*
Note
 지역 함수를 정의
 다른 확장 함수안에 확장함수를 내포 시킬수도 있으며
 이런 경우 this 식이 가장 안쪽에 있는 함수의 수신 객체를 뜻
 */
interface Truncated{
    val truncated: String
    val original: String
}

private fun String.truncator(max:Int) = object: Truncated {
    override val truncated
    get() = if (length <= max) this@truncator else substring(0 , max)

    override val original: String
        get() = this@truncator
}

fun main4() {
    val truncated = "Hello".truncator(3)

    println(truncated.original)
    println(truncated.truncated)
}

/*
Note
 널이 될 수 있는 타입에도 확장을 정의
 바깥에서 정의하고 널 값을 처리는 함수쪽에 있음
 */
fun String?.truncate(maxLength: Int): String? {
    if (this == null) return null
    return if (length <= maxLength) this else substring(0, maxLength)
}

fun main5() {
    val s = readLine()
    println(s.truncate(3))
}


