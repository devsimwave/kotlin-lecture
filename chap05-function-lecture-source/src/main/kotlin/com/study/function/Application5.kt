package com.study.function

/**
 * 람다식
 * 익명 함수의 형태로 화살표 표기법을 사용한다.
 *
 * 람더식 구성
 * var 함수처럼 사용할 변수 : 람다식의 선언 자료형 = { 람다식의 매개변수 -> 람다식의 처리 내용 }
 * 예)
 * 1. 전체 모습
 * var plus: (Int, Int) -> Int = {x: Int, y: Int -> x + y }
 *
 * 2. 선언 자료형 생략 가능
 * var plus = {x: Int, y: Int -> x + Y }
 *
 * 3. 람다식 매개변수 자료형 생략 가능
 * var plus: (Int, Int) -> Int = { x, y -> x + y }
 *
 */
fun main(args: Array<String>) {
//    var square: (Int) -> Int = {x: Int -> x * x} // 전체 모습
    var square = {number: Int -> number * number} // 선언 자료형 생략 가능
    println(square(4))

    var printHello: () -> Unit = { println("hello") } //Unit return 타입이 없는 경우 java의 void와 같은 개념
    printHello()

    printHello = { println("Bye") } // 파라미터나 리턴 타입이 없는 경우 타입 추론도 가능하다
    printHello()

//    var sum: (Int, Int) -> Int = {x: Int, y: Int -> x + y} // 전체 모습
//    var sum: (Int, Int) -> Int = {x, y -> x + y}        // 매개변수의 자료형 생략 가능
//    var sum = {x: Int, y: Int -> x + y}
//    var sum = {x, y -> x + y}       // 매개변수의 타입이 어떤 자료형인지 몰라 컴파일 오류가 발생한다.
    println(sum(3, 4))

//    var sayHelloTo: (String) -> Unit = { target: String -> println("say hello to $target") }
    var sayHelloTo: (String) -> Unit = { println("say hello to $it") } // it : 매개변수를 사용하지 않는 대명사
    sayHelloTo("김철수")

}