package com.study.function

fun main(args: Array<String>) {
    printHello()
    println(getHello())
    println(sum(10, 20))
    println(getBigger(10, 20))
    println(getGrade(100))
    println(removeAllSpace("안녕하세요 만나서 반갑습니다"))
}

fun printHello() {
    println("Hello")

    /* return 생략 가능 */
//    return
}

/* 전달받은 인자는 없고 문자열을 반환하는 함수 */
fun getHello(): String {
    return "Hello"
}

/* 아래의 주석된 함수를 포현식을 이용하여 함수 정의 가능하다  */
//fun sum(a: Int, b: Int): Int {
//    return a + b
//}
fun sum(a: Int, b: Int): Int = a + b

/* 조건문을 이용하여 함수 정의 */
/* 대입되는 값에 따라 타입 추론이 가능하기 때문에 리턴 타입 생략이 가능하다 */
fun getBigger(a: Int, b: Int): Int = if(a > b) a else b

fun getGrade(score: Int): String = when(score) {
    in 91..100 -> "A"
    in 92..90 -> "B"
    in 71..80 -> "C"
    else -> "D"
}

fun removeAllSpace(target: String): String = target.replace(" ", "")

