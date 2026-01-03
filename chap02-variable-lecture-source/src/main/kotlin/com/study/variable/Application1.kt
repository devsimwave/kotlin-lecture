package com.study.variable

/**
 * 변수를 선언하는 방법
 * 선언 형식 : val(var) 변수명 [: 타입] = 값
 */
/**
 * 1. 선언 후 초기화(타입 명시)
 *  var 변수명: 타입 (선언만 할 경우 반드시 먼저 변수명 뒤에 콜론(:)을 붙여 타입을 지정해야 한다.
 *  변수명 = 값
 *
 * 2. 선언과 동시에 초기화(타입 생략 가능)
 *  var 변수명: 타입 = 값 (타입이 생략되어도 타입 추론이 가능하기에 타입을 생략할 수 있다.)
 *
 */

/* 자바와 달리 클래스 내에 메인 함수를 만들게 되면 동작하지 않는다. */
fun main(args: Array<String>) {

    var name: String
    name = "홍길동"
//    name = 20 // 다른 타입의 값을 담을 수 없다.
    println(name)

    // 선언과 동시체 초기화 (타입 생략 가능)
//    var age: Int = 19
    var age = 19

    println(age)

//    var height: Double = 190.5
    var height  = 190.5

    println(height)

}


