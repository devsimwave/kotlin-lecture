package com.greedy.`class`

/* open 키워드를 붙이지 않으면 기본적으로 클래스나 메소드에 final 키워드가 붙는다. final 키워드는 상속 및 오버라이딩 불가 */
open class PublicClass
    (var publicProp1: String, private var privateProp1: String) {

    var publicProp2 = "public prop2"
    private var privateProp2 = "public prop2"
    protected var protectedProp = "protected"

    open fun publicFunc() {
        println("publicFunc 호출함")
        privateFunc()
    }

//    open private fun privateFunc() = println("privateFun 메소드 호출")
    private fun privateFunc() = println("privateFun 메소드 호출")

}

fun main(args: Array<String>) {
    var publicClass = PublicClass("Hello", "World")
    println(publicClass.publicProp1)        // 코드상으로는 필드에 직접 접근하지 않는거 같지만 내부적으로는 getter, setter 다 만들어줌
//    println(publicClass.privateProp1)       // 해당 매개변수 키워드가 private이라 getter, setter 만들어주지 않아 접근 불가하다.
    println(publicClass.publicFunc())
//    println(publicClass.privateFunc())   // private 키워드 접근 불가
}

// kotlin에서는 java와 다르게 class에 private 키워드를 붙일 수 있다. 다른 파일에서는 참조 불가
private class privateClass {}

private fun privateFun() = println("private Function")
fun publicFunc() = println("public function")
//open fun publicFunc() = println("public function") function은 open키워드 불가

private val privateConstant = "private constant"