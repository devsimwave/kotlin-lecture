package com.greedy.`class` // kotlin을 Java와 달리 패미지명을 예약어로 사용할 수 있으며 백틱 기호가 붙는다. 권장은 아니지만 이런 방법도 있음

/**
 *  클래스 내부에 정의한 변수 혹으 상수를 속성(property)라고 하며
 *  함수는 메소드(method)라고 한다.
 *
 */
class Car {

    /* 속성 정의*/
    var speed: Int = 0
    var isOn: Boolean = true

    /* 메소드 정의 */
    fun accelate() {
        speed += 10
    }

    fun decelerate() {
        speed -= 10
        if(speed < 0) speed = 0
    }

    fun turnOn() {
        isOn = true
    }

    fun turnOff() {
        isOn = false
    }

    fun showSpeed() {
        println("current speed : $speed")
    }
}

fun main(args: Array<String>) {
    var c = Car() // 객체 생성

    println(c.isOn)
    println(c.speed)

    c.accelate()

    c.showSpeed()
}

