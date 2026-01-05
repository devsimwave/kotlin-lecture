package com.study.operator

fun main(args: Array<String>) {

    /* 비교연산자 */
    var r1 = (1 == 1)
    var r2 = (1 != 2)
    var r3 = ("hello" == "hello")
    var r4 = 2 > 1
    var r5 = 2 >= 1

    println("(1 == 1) : $r1")
    println("(1 != 2) : $r2")
    println("""("hello" == "hello") $r3""")
    println("2 > 1 : $r4")
    println("2 >= 1 : $r5")

    /* 논리연결연산자 */
    var r6 = true && true
    var r7 = true || false

    /* 논리부정연산자 */
    var r8 = !true

    println("r6 : $r6")
    println("r7 : $r7")
    println("r8 : $r8")


}