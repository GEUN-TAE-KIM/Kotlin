package org.cream.kotlin.클래스

import kotlin.math.PI

/*
Note
 추상 클래스는 직접 인스턴스화 할수 없고 다른 클래스의 상위 클래스 역할만 가능

TODO
 추상 클래스와 추상 멤버
 */
abstract class Entity(val name: String)

class Person(name: String, val age: Int) : Entity(name)

/*
Note
 추상 멤버는 타입, 파라미터, 반환 타입 등 함수나 프로퍼티의 기본적인 모습을 정의

TODO
 추상 클래스와 추상 멤버
 */
abstract class Shape {
    abstract val width: Double
    abstract val height: Double
    abstract fun area(): Double
}

class Circle(private val radius: Double) : Shape() {

    override val width: Double
        get() = 2 * radius

    override val height: Double
        get() = 2 * radius

    override fun area() = PI * radius * radius
}

class Rectangle(override val width: Double, override val height: Double) : Shape() {
    override fun area() = width * height
}

fun Shape.print() {
    println("Bounds: $width*$height, area: ${area()}")
}

fun main() {
    Circle(10.0).print()

    Rectangle(3.0, 5.0).print()
}