package com.study.inheritance

open class Animal(var name: String, var age: Int, val gender: String) {
    var test1: Int = 0
    var test2: Int = 0

    fun eat(food: String) {
        println("${name}이(가) ${food}를(을) 먹습니다.")
    }

    fun sleep(hour: Int) {
        println("${name}이(가) ${hour}시간 동안 잡을 잡니다.")
    }

}

/**
 * kotlin의 상속 문법은 : 객체타입이다.
 * 부모 클래스는 반드시 open class로 되어 있어야 한다.
 */
class Rabbit(name: String, age: Int, gender: String, var location: String, var weight: Int, var kinds: String) : Animal(name, age, gender) { // : Animal(name, age, gender) 부모클래스 상속 문법

//    override var test1: Int = 5 Kotlin은 부모 필드가 open 키워드가 붙어 있으면 필드 및 속성 오버라이드가 가능하다.

    fun jump() {
        println("${location}에 살고 있는 모메가게 ${weight}kg인 ${kinds}종 토키${name}이(가) 깡총깡총 뜁니다.")
    }

}

open class Parent(var paretProp: Int) {
    fun parentFunc() {
        println("parentFunc")
    }
}

class Child(prop: Int, var childProp: Int) : Parent(prop) {
    fun childFunc() {
        println("${super.paretProp}") // 부모가 가지고 있는 속성 직접 접근
        println("$paretProp") // 생략 가능하다. this에서 값이 없으면 super로 처리한다.
        super.parentFunc()
        parentFunc()
    }
}

fun main(args: Array<String>) {
    var rabbit = Rabbit("엽기토끼", 25, "충성", "강남", 100, "라이언헤드")

    rabbit.eat("햄버거")
    rabbit.sleep(5)

    rabbit.jump()

    var p = Parent(1)
    println("${p.paretProp}")
    var c = Child(2, 3)
    println("${c.paretProp} ${c.childProp}")

    var poly: Parent = Child(4, 5) // 다형성 적용
    poly.parentFunc()

    /**
     * is로 if문 안에 조건을 작성하면 블럭 내의 레퍼런스 변수는 다운캐스팅 된다
     * 직접 다운캐스팅을 하기 위해서는 as 연산자를 사용한다.
     */
    if(poly is Child) {
        poly.childFunc()
    }
    (poly as Child).childFunc()

}