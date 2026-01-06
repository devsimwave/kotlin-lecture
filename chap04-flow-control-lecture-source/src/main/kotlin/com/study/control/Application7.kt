package com.study.control

fun main(args: Array<String>) {

    var arr = arrayOf(1, 2, 3)
    for(i in arr) {
        println(i)
    }

    /* list */
    var list = listOf(1, 2, 3)
    for(item in list) {
        println(item)
    }

    /* map */
    var map = mapOf(1 to "a", 2 to "b", 3 to "c")
    for(pair in map) {
        println(pair)
    }

    /* set */
    var set =  setOf("a", "b", "c")
    for(e in set) {
        println(e)
    }


    var str = "hello"
    for(c in str) {
        println(c)
    }

}