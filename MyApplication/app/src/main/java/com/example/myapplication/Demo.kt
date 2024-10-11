package com.example.myapplication

fun main() {
//    task(){
//            a,b -> a + b
//    }
    task { a, b -> a + b }
}

fun task(temp: (Int, Int) -> Int) {
    var sum: Int = 0
    for (a in 1..5) {
        sum += a
    }
    println("Sum of numbers : $sum")
    val c = temp(10, 20)

    println(c)
}
