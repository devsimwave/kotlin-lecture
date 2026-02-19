package com.greedy.`class`

/* 클래스를 정의하는 방법 */
/* 1. 생성자가 없는 클래스 */
class Person1 {
    var name: String = "홍길동"
    var age: Int = 0
}

/* 2. 주 생성자가 포함된 클래스 */
class Person2(val name: String, var age: Int, val gender: String) {

    fun test() {
        println(name)
    }
}

/* 3. 주 생성자를 통해서 값만 전달받는 클래스 */
/* 매개변수에 val, var 키워드를 생략하면 생성자에 선언된 매개변수는 속성으로 취급하지 않는다. */
class Person3(name: String, age: Int, gender: String) {

    var name: String = name // val, var 키워드를 생략하면 속성을 생성자 내부에 직접 만들어줘야함 2번 처럼 메소드 내부에 직접 접근하면 오류남

    fun test() {
        println(name)
    }
}

/* 4. 주 생성자에 기본값이 설정된 클래스 */
class Person4(val gender: String, val name: String = "유관순", var age: Int = 20) {

}

fun main(args: Array<String>) {
    var p1 = Person1()
    println(p1.name + ", " + p1.age)

    var p2 = Person2(age=20, gender="남성", name="홍길동")
    p2.test()
    println(p2.age)
    println(p2.gender)
    println(p2.name)

    var p3 = Person3("신사임당", 23, "여성")
    p3.test()
//    println(p3.gender) // 매개변수이지 속성이 아니기 떄문에 접근이 불가함

    var p4 = Person4("여성")
    println("${p4.name} ${p4.age} ${p4.gender}")

    p4 = Person4("남성", "세종대왕", 35)
    println("${p4.name} ${p4.age} ${p4.gender}")

}

