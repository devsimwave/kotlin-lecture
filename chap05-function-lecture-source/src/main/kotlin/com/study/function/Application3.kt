package com.study.function

/**
 * 명명인자(Named Argument)로 함수를 호출
 * 코틀린에서는 인자값의 갯수가 많다면 일일이 전달해야 할 인자값의 순서와 타입을 기억하는
 * 불편함을 해소하기 위해서 매개변수의 이름과 인자값을 동시에 전달하는 형태로
 * 함수를 호출할 수 있도록 지원한다
 */

fun main(args: Array<String>) {
    sayHelloTo(times=2, to="유관순", from="이순신")
    sayHelloTo("이순신", "유관순",3 )
    sayHelloTo("이순신", times=2, to="유관순")
//    sayHelloTo(times=3, "이순신", "유관순") 순서대로 넣지 않고 인자값을 사용한다면 컴파일 오류가 난다. 단, 순서대로 넣거나 첫번째 인자값은 인자값의 타입 없이 사용 가능하다.
}

fun sayHelloTo(from: String, to: String, times: Int) {
    println("${from}씨가 ${to}에게 ${times}번 인사를 했습니다.")
}