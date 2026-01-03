package com.study.variable

/**
 * 상수(const val)와 읽기 전용 변수(val)
 * 변하지 않을 값을 저장하기 위해서는 변수를 상수나 읽기 전용 변수로 할 수 있다.
 * 하지만 이 두 가지 방법에는 차이가 있다.
 * 상수는 컴파일 시에 값이 결정되기 때문에 기본 데이터 타입이나 문자열인 String만 입력할 수 있다(컴파일 시점에 값이 있어야 함)
 * kotlin에서는 static 키워드가 존재하지 않지만 Java의 static final과 유사하다고 볼 수 있다.
 * 또한 상수는 전역 변수로써 메소드나 클래스 밖에서만 선언이 가능하다.
 * 반면 읽기 전용 변수는 다양한 데이터 타입이 모두 가능하며 전역변수나 지역변수 모두 사용이 가능하다.
 *
 * var : variable의 약자 (mutable -  변경 가능)
 * val : value의 약자 (immuatble - 변경 불가능),
 *      객체에 대한 참조값을 가지고 있다면 참조값을 변경하지 못하는 것이지 객체 내부의 속성값은 변경 가능하다.
 */




/* 전역 */
const val PI = 3.14

class Student {}

/* const val은 기본 자료형과 String만 가능하다. */
//const val student: Student = student()

val lecture = "kotlin"
val student: Student = Student()

fun main(args: Array<String>) {
    /* 지역 */
//    const val PI = 3.14  // const val은 지역에서는 사용할 수 없어 컴파일 오류가 난다.

    val lecture2 = "android"
//    lecture2 = "java" // val은 재할당이 불가능해 컴파일 오류가 난다.
    val student: Student = Student()
}