package org.cream.kotlin.클래스

/*
Note
 코틀린은 단일 상속만 지원 -> 상위 클래스가 최대 하나

TODO
 하위 클래스 선언

me
 open class 상속에 대하여 열림 해주세요 이런거
 */
open class Vehicle {
    var currentSpeed = 0

    open fun start() {
        println("i'm moving")
    }

    fun stop() {
        println("Stopped")
    }
}

class Car : Vehicle() {
    override fun start() {
        println("I'm riding")
    }
}


class Boat : Vehicle() {
    override fun start() {
        println("I'm sailing")
    }
}

open class FlyingVehicle : Vehicle() {
    fun takeOff() {
        println("Taking off")
    }
    fun land() {
        println("Landed")
    }
}

class Aircraft(val seats: Int) : FlyingVehicle()

fun startAndStop(vehicle: Vehicle) {
    vehicle.start()
    vehicle.stop()
}

fun main1() {
    startAndStop(Car())
    startAndStop(Boat())
}

/*
Note
 상위 클래스부터 하위 클래스 순서로 초기화가 진행

TODO
 하위 클래스 초기화
 */
open class  Vehicle1 {
    init {
        println("vegicle")
    }
}

open class Car1 : Vehicle1() {
    init {
        println("car")
    }
}

class Truck: Car1() {
    init {
        println("Truck")
    }
}

fun main2() {
    Truck()
}