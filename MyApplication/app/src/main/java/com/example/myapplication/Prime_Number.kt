package com.example.myapplication


fun main(){
   var n:Int = readln().toInt()
    var isPrime : Boolean = true;
    for(a in 2..n/2){
        if(n%a==0){
            isPrime = false;

        }
    }
    println(if(isPrime)"prime" else "not")
}