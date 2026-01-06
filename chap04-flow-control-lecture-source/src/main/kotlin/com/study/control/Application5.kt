package com.study.control

fun main(args: Array<String>) {

    var range = 1..10
    println("range: $range")
    println("range.first : range: ${range.first}")
    println("range.last : range: ${range.last}")

    for(i in 1..10) {
        println(i)
    }

    /* until */
    var oneToNine = 1 until 10
    println("oneToNine: $oneToNine")
    println("oneToNine.first : ${oneToNine.first}")
    println("oneToNine.last : ${oneToNine.last}")

    for(v in oneToNine) {
        println(v)
    }

    /* 배열을 이용한 반복문 */
    var arr = arrayOf(1, 2, 3)
    for(idx in 0..(arr.size - 1)) {
        println("$idx : ${arr[idx]}")
    }

    /* until은 마지막 숫자는 제외하기 때문에 마지막 인덱스 까지의 범위로 range객체를 생성하게 된다*/
    for(idx in 0 until arr.size) {
        println("$idx : ${arr[idx]}")
    }

    /* downto : 역순으로 내려가는 range 객체가 생성이 됨*/
    var tenToOne = 10 downTo 1
    for(i in tenToOne) {
        println(i)
    }

    /* reversed : 역순으로 정렬된 범위 객체 생성됨 */
    var tenToOne2 = range.reversed()
    for(i in tenToOne2) {
        println(i)
    }

    var oneToTenStepTwo = 1..10 step 2
    for(i in oneToTenStepTwo) {
        println(i)
    }

    /* 10부터 2씩 감소하되 1보다 큰 범위 객체 생성 */
//    var tenToOneStepTwo = 10 downTo 1 step 2
    var tenToOneStepTwo = 10.downTo(1).step(2)      // 메소드 형태로도 제공하고 있다
    for(v in tenToOneStepTwo) {
        println(v)
    }

    /* 문자 범위의 객체를 생성하는 것도 가능하다 */
    var aToZ = 'a'..'z'
    for(c in aToZ) {
        println(c)
    }

    var gaToNa = '가'..'나'
    for(c in gaToNa) {
        println(c)
    }

}