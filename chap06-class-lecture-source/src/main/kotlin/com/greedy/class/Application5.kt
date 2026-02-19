package com.greedy.`class`

class Person5(var name: String, var age: Int, var gender: String) {

    var job: String = "unknown"
    var salary: Int? = null

    constructor(name: String, age: Int, gender: String, job: String) : this(name, age, gender) {
        println("직업까지 정의하는 생성자 호출")
        this.job = job
    }

    constructor(name: String, age: Int, gender: String, job: String, salary: Int) : this(name, age, gender, job) {
        println("직업과 연봉까지 정의하는 생성자 호출")
        this.salary = salary

    }
}

fun main(args: Array<String>) {
    var p5 = Person5("김철수", 20, "남성")
    println("${p5.name} ${p5.age} ${p5.gender} ${p5.job} ${p5.salary}")

    p5 = Person5("이영희", 30, "여성", "의사")
    println("${p5.name} ${p5.age} ${p5.gender} ${p5.job} ${p5.salary}")

    p5 = Person5("김감수", 40, "gender", "프로그래머", 400000)
    println("${p5.name} ${p5.age} ${p5.gender} ${p5.job} ${p5.salary}")

}