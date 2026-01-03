package com.study.variable

/** 원시 문자열(RawString)과 문자열 템플릿(StringTemplate)
 *  일반 문자열은 엔터나 탭 같은 특수 기능을 표현하려면 이스케이픔 문자를 사용해야 하지만
 *  이와 달리 RawString(""")은 작성한 모습 그대롤르 출력할 수 있게 된다.
 */
fun main(args: Array<String>) {

    /* 일반 문자열 사용 */
    var str = "일반 문자열 안에서는 \n\n문자열 안에 엔터나 스페이스 \t 그리고 탭을 자유롭게 사용할 수 없으며\n이스케이프 문자를 이용해야 한다."

    /* RawString 사용 */
    var raw = """원시 문자열 안에서는

문자열 안에 엔터나 스페이스 그리고 탭을 자유롭게 사용할 수 있으며
이스케이프 문자 사용도 가능하다.
    """

    println(str)
    println(raw)

    /* 문자열 템플릿 : 문자열 안에서 '$'(문자열 템플릿)을 활용해서 변수의 값을 바로 적용할 수 있다.*/
    var num1 = 10
    var num2 = 20

    val strWithNum = "hell, $num1, $num2"
    println(strWithNum)

    /* 문자열 템플릿에서 표현식 사용 */
    var str2 = "\n\t hello \t\n"
    var trimStr = "trimStr : ${str2.trim()}"
    println(trimStr)

    /* 연산도 가능하다 */
    var sum = "sum : ${num1 + num2}"
    println(sum)

}