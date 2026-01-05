package com.study.operator

fun main(args: Array<String>) {

    /**
     * in 연산자
     * 1. 배열, 리스트, 집합 혹은 Range 객체에 특정 원소가 포함되어 있는지를 검사하기 위해서 사용
     */
    var arr = arrayOf(1, 2, 3, 4, 5)

    println("3 in arr : " + (3 in arr))
    println("5 in arr : " + (5 in arr))

    /* 리스트 요소 검사 */
    var list = listOf('a', 'b', 'c', 'd', 'e')

    println("'a' in list : ${'a' in list}")
    println("'f' in list : ${'f' in list}")

    /* .. 연산자를 이용하여 법위 객체 생성 */
    println(1 in 1..10)

    var a = 10
    println(a in 1..9)
    println('a' in 'a'..'z')

    println(1 !in 1..10)

    /* 2. 반복문에서 in 사용 */
    for(num in 1..5) {
        println(num)
    }

    var items = arrayOf('a', 'b', 'c')
    for(item in items) {
        println(item)
    }

    /* withIndex() 사용해 인덱스별 값도 출력 가능하다 */
    for((idx, item) in items.withIndex()) {
        println("$idx : $item")
    }
}