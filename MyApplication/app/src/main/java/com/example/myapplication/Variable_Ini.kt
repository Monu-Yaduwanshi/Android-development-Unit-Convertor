package com.example.myapplication

fun main(){

    println("Enter char")
    var ch : Char = readln().first()
    println("Enter age")
    var age : Int = readln().toInt();
    println("Enter name")
    var name = readln();
    println("Hello I am $name my age is $age and character is $ch")
}