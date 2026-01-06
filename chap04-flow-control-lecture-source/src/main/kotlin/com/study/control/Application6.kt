package com.study.control

fun main(args: Array<String>) {

    /* 구구단 */
    for(i in 2..9) {
        for(j in 1..9) {
            println("$i x $j =  ${i * j}")
        }
    }


    /**
     * *
     * **
     * ***
     * ****
     * *****
     */
    for(i in 1.. 5) {
        for(j in 1..i) {
            print('*')
        }
        println()
    }
}