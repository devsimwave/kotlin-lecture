package com.study.function

/**
 * 로컬 함수
 * 복잡한 작업을 수행하는 함수의 기능을 분할한 후 여러 함수로 나누어 구현할 때 사용할 수 있다.
 * 단, 함수 내부에 정의한 로컬 함수는 함수 외부에서는 사용할 수 없다.
 */

fun main(args: Array<String>) {
//    var result = localFunc("test") 내부 함수는 외부에서 접근 불가능하다.
    var result = outerFunc("outer")
    println(result)
}

//fun outerFunc(target: String): String {
//    fun localFunc(str: String): String = "Hello from local $str"
//    return localFunc(target)
//}

fun outerFunc(target: String): String {
    fun localFunc(str: String): String {
        return "Hello from local $str"
    }
    return localFunc(target)
}

