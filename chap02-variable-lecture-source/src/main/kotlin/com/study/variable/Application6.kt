package com.study.variable

/**
 * Nullable 타입 
 * Java의 경우 null이 대입되는 참조자료형이나 Wrapper 클래스 같은 경우는 null값 여부를 확인하는 과정을
 * 생략하는 경우, 혹은 변수에 null값이 대입됐을 수도 있는 상황을 가정하지 않고 코드를 작성하는 경우
 * 런타입 시 NPE(NullPointerException)이 발생하는 상황이 생길 수 있다.
 * kotlin은 변수의 타입을 기본적으로 null값의 대입이 허용되지 않는 타입으로 선언 가능하게 설계되어 있기 때문에
 * NPE가 발생할 수 있는 상황을 줄여주게 된다.
 *
 */

fun main(args: Array<String>) {

    /* 기본적으로 null을 할당하면 컴파일 오류가 난다. */
    var num = 100
//    num = null

    /* 타입 뒤에 ? 선언하면 null 대입이 가능하다 */
    var a: Int? = 100
    a = null

    var s: String = "hello"
//    s = null

    var c: String? = null

    if(c != null) {
        println(c.length)
    }

    /** Java처럼 if문을 사용해 null 체크를 할 수 있지만
     * kotlin에서 if문 없이 npe 처리할 수 있는 다양한 방법을 제공한다.
     * 1. let 함수를 이용한 null 타입 접근 null이 아닌지 체크(if문이랑 똑같음)
     *  let 함수는 범위 함수로서 변수의 값이 null이 아닌 경우에 실행할 코드 블럭을 작성할 수 있게 도와주는 함수이다.
     *  it : value-parameter로 c가 null이 아닌 경우 c를 의미한다.
     * */
    c?.let {
        println(it.length) // it : value-parameter로 c가 null이 아닌 경우 c를 의미한다.
    }

    /**
     * 2. 안전 호출 연산자(Safe-call Operator)를 이용하는 방법
     * 안전 호출 연산자는 ?. 형태로 사용되며, 레퍼런스 변수가 null체크 후 null이 아닌 경우에만 해당 멤버에 접근하도록 도와준다. null인 경우 null을 반환한다.
     */
    var len: Int? = c?.length
    println(len)

    /**
     * 3. 엘비스 (Elvis) 연산자 ( ?: )를 이용하는 방법
     *  연산자 왼쪽의 피연산자가 null이 아닐 경우 해당 값을 반환하고 null일 경우 오른쪽 피연산자를 반환한다.
     *
     */
    var one = null ?: 1
    println(one)

    var two = 2 ?: 1
    println(two)

    var result = c?.length ?: 0
    println(result)

    /**
     *  4. null값이 아님을 보장하는 연산자(!!)를 사용해 null을 허용하지 않는 타입으로 변환
     *  컴파일 에러를 런타임 에러로 변환시키기 위한 연산자 */
    var nullableStr: String? = null

//    var str: String = nullableStr // str이 null을 허용하지 않는 타입이기 때문에 컴파일 오류 발생한다

//    var str: String = nullableStr!! // 런타임 시 NPE 발생

    /**
     * 5. null을 반환하는 타입 변환 메소드
     */
    var wrongNumberString = "숫자 아님"

    var wrong: Int? = wrongNumberString.toIntOrNull()
    println(wrong)
}