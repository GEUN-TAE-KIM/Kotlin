package org.cream.kotlin.클래스

/*
Note
 인터페이스는 추상 타입이며 다중타입도 가능

TODO
 인터페이스
 */
interface Vehicles {
    val currentSpeed: Int
    fun move()
    fun stop()
}

interface FlyingVehicles : Vehicles {
    val currentHeight: Int
    fun takeOff()
    fun land()
}

class Cars : Vehicles {
    override var currentSpeed = 0


    override fun move() {
        println()
       currentSpeed = 50
    }

    override fun stop() {
       currentSpeed = 0
    }

}