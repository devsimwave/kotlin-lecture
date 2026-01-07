package com.study.function

fun main(args: Array<String>) {

    println(sumWithDefault(20))
    println(sumWithDefault(20, 30))
    println(sumWithDefault(b = 30))

    //sumWithDefault fun과 다르게 기본값 인자가 없어 아무런 값도 넣지 않으면 컴파일 오류가 난다.
//    println(sumWithDefault2())
    println(sumWithDefault2(100))
    println(sumWithDefault2(100, 300))

    println(sumWithVargs(1,2,3,4,5))
    println(sumWithVargs(1,2,3))

    var numList = listOf(1, 2, 3, 4, 5)

    /**
     *  배열 이름 앞에 전개 연산자(*)를 써서 함수를 호출한다.
     *  전개 연산자의 의미는 객체 타입의 배열이 아닌 원시 타입의 배열을 활용한다는 의미이다
     */
//    println(sumWithVargs(numList.toIntArray())) // numList는 object 배열의 Wrapper 타입이라 타입 오류가 남
    println(sumWithVargs(*numList.toIntArray())) // 앞에 *을 붙이면 원시 타입의 배열 사용 가능

    println(wumWithVargsWithBase(100, 10, 20, 30, 40, 50))

}

/**
 *  인자를 생략하고 함수를 호출하는 경우 기본적으로 사용할 기본값을 설정할 수 있다.
 *  모든 매개변수에 기본값을 적용한 함수
 */
fun sumWithDefault(a: Int = 10, b: Int = 20): Int {
    return a + b
}

/* 일부 인자에만 기본값을 적용한 함수 */
fun sumWithDefault2(a: Int, b: Int = 20): Int {
    return a + b
}

/* varargs: 가변인자(인자값의 갯수가 변동될 수 있는 인자)를 매개변수로 하는 함수*/
fun sumWithVargs(vararg nums: Int): Int {
    var total = 0
    for(num in nums) {
        total += num
    }
    return total
}

fun wumWithVargsWithBase(base: Int, vararg nums: Int): Int {
    var total = base
    for(num in nums) {
        total += num
    }
    return total
}