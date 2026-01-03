package com.study.variable

/**
 * 배열
 * 같은 타입의 값을 여러 개 저장하고 관리하기 위해 사용
 *
 */
fun main(args: Array<String>) {

    // Java와 달리 kotlin은 new 연산자로 배열을 생성하지 않는다.
    var arr1: Array<Int> = Array<Int>(3) {0} // 크기가 3인 Int형 배열 생성, 모든 요소를 0으로 초기화
    var arr2 = Array(3) {0} // 타입 추론 가능

    var arrInitHundered = Array(3) {20}
    println(arrInitHundered[0])
    println(arrInitHundered[1])

    arrInitHundered[2] = 40 // 배열 요소 값 변경

    println(arrInitHundered[2])

    var stringArr = Array(2) {"hello"}

    stringArr[1] = "world"

    println(stringArr[0])
    println(stringArr[1])

    /* Wrapper 타입의 배열(null 허용 가능)  */
    var arr = arrayOf(100, 200, null) // arrayOf 함수로 배열 생성
    println(arr[0])
    println(arr[1])
    println(arr[2])

    /* primitive 타입의 배열(null 허용 안됨) */
//    var intArr  =  intArrayOf(1, 2, null)

    var charArr = charArrayOf('a', 'b', 'c')

    /* wrapper 타입 배열을 primitive 타입 배열로 변환하기 */
    var intWrapperArr = arrayOf(1, 2, 3)

    /* null값이 포함되어 변환할 수 없는 배열의 경우 컴파일 에러를 발생시킨다 */
    var intPrimitiveArr = intWrapperArr.toIntArray()
}