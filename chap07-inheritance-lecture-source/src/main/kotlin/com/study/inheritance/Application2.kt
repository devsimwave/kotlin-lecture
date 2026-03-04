package com.study.inheritance

//open class Parent() {} 동일한 패키지에 같은 클래스명을 붙일 수 없다 파일명이 달라서 헷갈리 수 있음
open class Parent2() {
    fun parentFunc() {
        println("from parentFunc")
    }

    open fun overrideableParentFunc() {
        println("from overridableParentFunc")
    }

    open fun overridableParentFuncWithArg(arg1: Int, arg2: String) {
        println("from overridableParentFuncWIthArg($arg1, $arg2)")
    }
}

class Child2 : Parent2() {

//    override fun parentFunc() {}  // final 키워드라 override 불가

    override fun overrideableParentFunc() {
        println("from overridecd overriableParentFunc")
    }

    override fun overridableParentFuncWithArg(arg1: Int, arg2: String) {
        println("from overrided overridableParentFuncWIthArg($arg1, $arg2)")
    }
}

fun main(args: Array<String>) {
    var p = Parent2()
    p.parentFunc()
    p.overrideableParentFunc()
    p.overridableParentFuncWithArg(100, "hello")

    var c = Child2()
    c.parentFunc()
    c.overrideableParentFunc()
    c.overridableParentFuncWithArg(200, "hello")

    var poly: Parent2 = Child2()
    poly.parentFunc()
    poly.overrideableParentFunc()
}