package com.study.basic

/*
    코틀린 메인 함수 자바의 public static void main(String[] args) 와 동일
    function 안에 매개변수 없이 실행 가능 디컴파일 시 자바의 public static void main(String[] args) 에서 함수 호출
 */
//fun main(args: Array<String>) {
fun main() {
    print("Hello, Kotlin!")

    // 한 줄에 여러 문장 작성 가능 (세미콜론으로 구분) 가독성이 떨어지므로 권장하지 않음
    print("Hello, Kotlin"); println("코틀린 시작")

    print("kotlin started : ")
    // var 변수란 변경 가능한 변수
    var completion = readLine()
    println("D+" + completion)
}