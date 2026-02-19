package com.greedy.`class`

/* 보조생성자 */
/* 주 생성자 없이 보조생성자만 있는 클래스 */
class MyClass {
    constructor() {
        println("보조 생성자 호출")
    }

    // this : 같은 클래스의 다른 생성자를 호출하는 역할을 한다. 여기서 this()는 매개변수가 없는() 형태라 이 생성자를 호출시 위에 보조생성자를 먼저 호출 후 이 생성자를 호출한다.
    constructor(arg: Int) : this() {
        println("다른 보조 생성자를 호출하며 매개변수있는 보조생성자 호출 ($arg)")
    }
}

/* 주 생성자가 존재하는 경우 보조생성자 있는 클래스 */
class MyClassWithPrimaryConstructor() {
    constructor(arg: Int) : this() {
        println("주 생성자를 호출하며 매개변수 있는 생성자 호출 ($arg)")
    }

    constructor(arg1: Int, arg2: Int) : this(arg1) {
        println("매개변수가 두 개인 생성자 호출 ($arg1, $arg2)")
    }
}

fun main(args: Array<String>) {
    var m1 = MyClass()
    var m2 = MyClass(123)
    var m3 = MyClassWithPrimaryConstructor()
    var m4 = MyClassWithPrimaryConstructor(111)
    var m5 = MyClassWithPrimaryConstructor(111, 222)

}

