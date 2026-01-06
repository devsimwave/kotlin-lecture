package com.study.control

fun main(args: Array<String>) {

    if(true) {
        println("true")
    }

    if(100 > 1) {
        println("true")
    }

    var a = 100
    if(a >= 100) {
        println("a는 100보다 크거나 같다")
    }

    var greet = "Hello World"
    if(greet.startsWith("Hello")) {
        println("문자열은 Hello로 시작합니다")
    }

    var age = 20
    var gender = "남성"
    if(age >= 20 && gender == "남성") {
        println("성인 남성입니다")
    }

    var score = 79
    var grade: String
    if(score == 100) {
        grade = "A"
    } else if(score in 90 until 100) {  // until for range(..) 객체와 같은 개념
        grade = "B"
    } else if(score in 80 until 90) {
        grade = "C"
    } else {
        grade = "D"
    }

    println("grade : $grade")
}