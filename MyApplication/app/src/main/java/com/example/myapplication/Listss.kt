package com.example.myapplication

fun main(){
    var list= listOf(6,4,5,6,5);
    println(list)
    println(list.first())
    println(list.last())
    println(6)
    println(5 in list)
    println(list.count())
}

//fun main(){
//    var list= listOf(6,4,5,6,);
//    println(System.identityHashCode(list))
//    list+=100;
//    println(System.identityHashCode(list))
//}