package com.study.control

fun main(args: Array<String>) {

    var num1 = 10
    var num2 = 20

    /* 변수 안에 조건문 결과를 할 수 있다 */
    var bigger = if(num1 > num2) num1 else num2

    println("bigger : $bigger")

    var score = 85
    var grade = if(score == 100) {
        "A"
    } else if(score in 90 until 100) {
        "B"
    } else if(score in 80 until 90) {
        "C"
    } else {
        "D"
    }

    println("grade: $grade")

}