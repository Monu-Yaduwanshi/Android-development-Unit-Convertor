//package com.example.myapplication
//
//fun main(){
//    println("Enter age")
//    var age : Int = readln().toInt();
//    println("Enter name")
//    var name = readln();
//    if(age>= 18)
//        println("Eligible")
//    else
//        println("Not eligible")
//}

package com.example.myapplication

fun main() {
    println("Enter age")
    val age: Int = readln().toInt()
    println("Enter name")
    val name = readln()

    println(if (age >= 18) "Eligible" else "Not eligible")
}
