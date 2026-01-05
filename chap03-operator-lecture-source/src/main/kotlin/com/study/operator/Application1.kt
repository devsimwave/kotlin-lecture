package com.study.operator

fun main(args: Array<String>) {
    var sum = 5 + 8
    var sub = 4 - 6
    var mul = 3 * 5

    println("sum : $sum")
    println("sub : $sub")
    println("mul : $mul")

    var div = 6 / 5
    var divDouble1 = 6.0 / 5.0
    var divDouble2 = 6 / 5.toDouble()

    println("div : $div")
    println("divDouble1 : $divDouble1")
    println("divDouble2 : $divDouble2")

    var mod1  = 6 % 5

    println("mod1 : $mod1")

    var complex = ((5 + 3) * (4 / 2)) % 3

    println("complex : $complex")

    var v1 = 1
    var v2 = 2
    var result = (v1 + v2) + 10

    println("result : $result")

    var intValue1: Int = 2147483647
    println("before overflow : $intValue1")

    intValue1 = intValue1 + 1
    println("after overflow : $intValue1")

    var intValue2: Int = -2147483648
    println("over underflow : $intValue2")

    intValue2 = intValue2 - 1
    println("after underflow : $intValue2")

    /* 대입연산자 */
    var value1 = 100
    var value2 = (1 + 3) * (20 / 5)
    var value3 = " hello ".trim()

    /* 복합 대입 연산자 */
    var w1 = 10

    w1 += 20
    println("w1 += 20 : $w1")

    w1 -= 10
    println("w1 -= 10 :  $w1")

    w1 *= 2
    println("w1 *= 20 : $w1")

    w1 /= 2
    println("w1 /= 20 : $w1")

    w1 %= 3
    println("w1 %= 20 : $w1")

    /* 증감연산자 */
    var value = 100

    value++
    println("after value++ : $value")

    value--
    println("after value-- : $value")

    /* 부호연산자 */
    println("-value : " + (-value))
}