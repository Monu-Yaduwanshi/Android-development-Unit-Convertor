package com.example.myapplication

//fun main(){
//    var arr:Array<Int> = arrayOf(56,89,54,6,4,5,4,5,5,);
//    println(arr.joinToString ())
//}


//fun main(){
//    var arr:Array<Int> = arrayOf(56,89,54,6,4,5,4,5,5,"Monu");
//    println(arr.joinToString ())
//}


fun main(){
    var arr:Array<Int> = arrayOf(56,89,54,6,4,5,4,5,5,);
    println(arr.joinToString ())
    arr[0]=17;
    println(arr.joinToString ())
    arr +=20;
    println(arr.joinToString ())

}