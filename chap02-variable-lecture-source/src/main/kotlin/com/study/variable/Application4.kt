package com.study.variable

/**
 * kotlin은 Java와 달리 자동으로 형변환 해주지 않아 명시적으로 형변환을 해줘야 한다.
 * 타입 변환
 * toByte() : Byte 타입으로 변환
 * toShort() : Short 타입으로 변환
 * toInt() : Int 타입으로 변환
 * toLong() : Long 타입으로 변환
 * toFloat() : Float 타입으로 변환
 * toDouble() : Double 타입으로 변환
 * toChar() : Char 타입으로 변환
 */
fun main(args: Array<String>) {

    var byteValue: Byte = 65
    println(byteValue)

    var intValue: Int = byteValue.toInt()
    println(intValue)

    var shortValue: Short = byteValue.toShort();
    println(shortValue)

    var longValue: Long = byteValue.toLong()
    println(longValue)

    val floatValue: Float = byteValue.toFloat()
    println(floatValue)

    var doubleValue: Double = byteValue.toDouble()
    println(doubleValue)

    var charValue: Char = byteValue.toInt().toChar()
    println(charValue)

    /* 문자열을 기본 타입으로 변환 */
    var intString: String = "1234"
    var doubleString: String = "1.234"

    var stringToInt: Int = intString.toInt()
    var stringToDouble: Double = doubleString.toDouble()

    println(stringToInt)
    println(stringToDouble)

    /* 기본 타입을 문자열로 변환 */
    var num: Int = 123
    var intToString: String = num.toString()
    println(intToString)

    /* 문자열 파싱 오류 */
    var wrongNumberString: String = "문자열"
//    var wrong: Int = wrongNumberString.toInt()

    /**
     *  코틀린은 nullsafety 기능이 내장되어 있어 널 참조로 인한 오류를 방지할 수 있다.
     *  ? : null이 될 수 있는 타입을 지정할 때 사용
     *  toIntOrNull() : 문자열을 Int 타입으로 변환하는데 변환할 수 없으면 null을 반환
     */
    var wrong2: Int? = wrongNumberString.toIntOrNull()
    println(wrong2)

}
