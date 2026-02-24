package com.greedy.`class`

import java.util.*

/**
 * lazy 키워드
 * - 해당 속성값을 사용하는 시점에 값을 초기화 하는 편이 합리적이다라는 생각으로 만들어진 키워드
 * 속성에 접근하는 시점에 값의 초기화 작업이 이루어지게 하는 키워드이다.
 * 주로 메모리 절약이나 성능을 위해 미루고 싶을 때 사용한다.
 *
 * lateinit
 * - 미리 초기화하지 않고 실제 접근이 일어나는 시점에 초기화 하는 것이 합리적이다 라는 생각으로 만들어진 키워드이다.
 * 만들어진 키워드로 당장 값을 대입하기는 어려운 상황에서 나중에 해당 속성에 접근하기 전까지는
 * 속성값이 초기화 된 것을 보장하려고 할 떄 사용한다.(Dependency Injection)
 */
class LazyClass(var x: Int) {

    // 지금 초기화하는게 아닌 나중에 필요로 할 때 초기화 하는 역할 by lazy 키워드와 블록 형태로 사용한다.
    val lazyValue1 by lazy {
        println("lazyValue1 속성 초기화 진행")
        var s = " Hello "
        s.trim()
    }

    // var 키워드 사용 불가 val로만 사용할 수 있는 블록이다.
//    var lazyValue2 by lazy {
//        x * 2
//    }
    val lazyValue2 by lazy {
        x * 2
    }

    val constHeavyProperty by lazy {
        println("시간이 오래 걸리고 메모리 사용량이 많은 속성 값을 초기화 진행")
        Thread.sleep(1000)
        Array<Byte>(1024 * 1024 * 100) {0}
    }

}

class PropertyObject {
    fun func() {
        println("from PropertyObject Function")
    }
}

class LateInitClass {
    // lateinit : 나중에 초기화 하려는 목적으로 사용한다. lazeinit은 var 키워드만 사용 가능하다. primitive 타입으로 할당할 시 컴파일 오류난다.
    lateinit var obj: PropertyObject

    fun initMyObject(value: PropertyObject) {
        obj = value
    }

    fun useMyObject() {
        obj.func()
    }
}

fun main(args: Array<String>) {

    // 초기화가 객체를 만드는 시점에 일어나지 않는다.
    var lazyClass = LazyClass(10)
    println(lazyClass.lazyValue1)
    println(lazyClass.lazyValue2)

    if(Random().nextBoolean()) {
        println(lazyClass.constHeavyProperty)
    }

    var lateInitClass = LateInitClass()
//    lateInitClass.useMyObject() // 초기화가 안된 상태에서 호출 시 런타임 오류
    lateInitClass.initMyObject(PropertyObject())
    lateInitClass.useMyObject() // 초기화가 안된 상태에서 호출 시 런타임 오류

}