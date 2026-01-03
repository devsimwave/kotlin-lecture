package com.study.variable

/**
 * Any 타입
 * 모든 타입의 값을 대입할 수 있는 최상위 타입
 * Any 타입 변수는 초기화 이후에도 어떤 종류의 값이든 대입이 가능하다.
 */

fun main(args: Array<String>) {

    var anyValue: Any

    anyValue = 100
    println(anyValue::class.simpleName)

    anyValue = "Hello"
    println(anyValue::class.simpleName)

    anyValue = 1.234
    println(anyValue::class.simpleName)

    // Array에 Any 타입으로 와일드카드처럼 사용가능하다.
    var anyTypeArr: Array<Any> = arrayOf(1, 1.234, "hello")

}