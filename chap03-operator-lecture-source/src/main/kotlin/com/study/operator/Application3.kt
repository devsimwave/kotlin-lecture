package com.study.operator

fun main(args: Array<String>) {

    var nums = arrayOf(100, 101, 102)

    // 변경 가능한 map
    var areaCodeMap = mutableMapOf(
        "02" to "서울",
        "055" to "경남"
    )

    println(areaCodeMap["02"])
}