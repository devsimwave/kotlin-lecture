package com.study.control

fun main(args: Array<String>) {

    /* java의 switch문 같은 문법 */
    var num = 1
    when(num) {
        1 -> println("one")
        (1.inc()) -> println("two")  // 연산처리를 할 수 있다
//        2 -> println("two")
        3 -> println("three")
        else -> println("No Match")
    }

    when (num) {
        1 -> {
            println("hello")
            println(num)
        }
        2 -> {
            println("world")
            println(num)
        }
    }

    /* 반환값도 가질 수 있다 */
    var a = 10.0
    var b = 20.0
    var op = '+'
    var result: Double? = when(op) {
        '+' -> a + b
        '-' -> a - b
        '*' -> a * b
        '/' -> a / b
        else -> null
    }

    println("result: $result")

    /* 나열 연산자를 이용해 다중 조건을 작성할 수 있다 */
    var grade = "A+"
    var gradeResult = when(grade) {
        "A+", "a+", "A-", "a-" -> "수"
        "B+", "b+", "B-", "b-" -> "우"
        "C+", "c+", "C-", "c-" -> "미"
        "D+", "d+", "D-", "d-" -> "양"
        else -> "가"
    }

    println("gradeResult: $gradeResult")

    /* 타입 일치 조건 */
    var x: Any = "Hello"
    when(x) {
        is String -> println(x.length)      // is 연산자 : 타입이 맞는지 확인하는 연산자
        is Int -> println(x * 2)
        is Double -> println(x.toInt())
        else -> println("No Match")
    }

    /* range(..)를 사용하여 범위로 검색 */
    var score = 100
    var scoreResult = when (score) {
        in 91..100 -> "100"
        in 81..90 -> "B"
        in 71..80 -> "C"
        else -> "D"
    }

    println("scoreResult : $scoreResult")

    var score2 = 90
    var gradeScore2 = when {
        (score2 == 100) -> "만점"
        (score in 91 until 100) -> "100"
        (score in 81 until 90) -> "B"
        else -> "양호"
    }

    println("gradeScore2: $gradeScore2")

    /* Boolean 타입 이용 */
    var booleanValue: Boolean = true
    var booleanResult = when(booleanValue) {
        true -> "참"
        false -> "거짓"
    }

    println("booleanValue: $booleanValue")

}