package com.greedy.`class`

/* setter/getter */
class GetterAndSetterDemo() {

    /* Java와 달리 Kotlin에서는 var,. val키워드 하나로 Getter/Setter를 자동으로 만들어준다. */
    var num: Int = 0
        // setter에 추가적인 내용을 작성하고 싶을 때 set 메소드를 사용할 수 있다.
        set(value) {
            println("값을 ${value}으로 설정")
            // num 값을
//            num = value     // 여기서 자기 자신의 변수에 값을 할당하면 재귀호출이 일어나 직접적으로 필드를 선언하는게 아닌 'filed' 라는 필드를 이욯나다.
            field = value     // 백킹필드 (재귀 호출 방지 목적)
        }
        get() {
            println("${field}값을 반환") // getter도 마찬가지로 field를 사용해야 한다. 아니면 setter와 마찬가지로 재귀호출이 일어난다.
            return field
        }
}

class Person7(val name: String, pAge: Int) {

    var age: Int = 0
        set(value) {
            when {
                value < 0 -> throw Exception("음수 나이는 허용되지 않습니다.")
                value > 200 -> throw Exception("나이가 비정상적으로 많습니다.")

            }
            field = value
        }

    init {
        age = pAge
    }

}

fun main(args: Array<String> ) {
    var demo = GetterAndSetterDemo()
    // Java처럼 setter 메소드를 사용하는게 아닌 자동으로 객체의 필드에 값을 대입하면 setter 값을 필드를 호출하면 getter로 변환해서 가젼온다.
    demo.num = 100
    println(demo.num)

    var p1 = Person7("김철수", 15)
    println(p1.name)
    println(p1.age)
    p1.age = 500

}