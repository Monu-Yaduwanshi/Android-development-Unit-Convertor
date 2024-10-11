package com.example.myapplication

fun main(){
    println("Enter")
    var n:Int = readln().toInt()
    var sum=0;
    while (n>0){
        val rem =n%10;
        sum =sum+rem;
        n=n/10;
    }
    println("Answer =  $sum")
}