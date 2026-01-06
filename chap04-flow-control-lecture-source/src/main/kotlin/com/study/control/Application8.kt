package com.study.control

fun main(args: Array<String>) {

    var sum = 0
    var i = 0
    while(true) {
        sum += i
        i++
        if(i > 10) {
            println("break 명령어 실행")
            break
        }
    }
    println("sum = $sum")

    for(i in 1..3) {
        println(i)
        break
        println("after break")
    }

    for(i in 1..3) {
        println("outer loop : $i")
        for(j in 1..3) {
            println("inner loop : $j")
            break
        }
    }

    while(true) {
        print("'b'를 입력하여 break 명령어를 실행 : ")
        var input = readLine()?.trim()
        if(input != null) {
            if(input == "b") {
                println("break 명령어를 이용하여 반복문을 탈출합니다.")
                break
            } else {
                println("${input}을 입력하였습니다.")
            }
        }
    }

    for(i in 2..9) {
        if(i % 2 != 0) {
            continue
        }
        for(j in 1..9) {
            println("$i x $j = ${i * j}")
        }
    }

}