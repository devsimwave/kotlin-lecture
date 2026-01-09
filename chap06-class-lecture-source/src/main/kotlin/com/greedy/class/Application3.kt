package com.greedy.`class`

/* init 블록을 이용해서 속성값을 초기화 */
/**
 * init 블록은 주 생성자를 통한 속성값 초기화 작업(대입 작업)이 끝난 직후에 실행된다.
 * 속성값을 초기화 할 떄 필요한 코드가 있다면 init 블록을 사용하게 된다.
 */
class Overlap1(var originName: String, var originAge: Int, var originGender: String) {
    var overName: String
    var overAge : Int
    var overGender: String

    init {
        overName = originName.reversed()
        overAge = originAge * 2
        overGender = if(originGender == "남성") "여성" else originGender
    }
}

class Overlap2(originName: String, originAge: Int, originGender: String) {
    var overName: String
    var overAge: Int
    var overGender: String

    init {
        overName = originName.reversed()
        overAge = originAge * 2
        overGender = if(originGender == "남성") "여성" else "남성"
    }
}

fun main(args: Array<String>) {
    var over1 = Overlap1("홍길동", 20, "남성")

    println("${over1.overName}, ${over1.overAge}, ${over1.overGender}")
    println("${over1.originName}, ${over1.originAge}, ${over1.originGender}")

    var over2 = Overlap2("유관순", 20, "여성")

    println("${over2.overName}, ${over2.overAge}, ${over2.overGender}")
//    println("${over2.originName}, ${over2.originAge}, ${over2.originGender}") 생성자에 var, val 키워드가 없어 속성 접근 불가능함
}