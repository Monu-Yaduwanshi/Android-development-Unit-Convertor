package com.example.myapplication

fun main(){
    val nullarray:Array<Int?> = arrayOfNulls(3)
    nullarray[0]=1;
    nullarray[1]=2;

    nullarray[2]=3;
   println(nullarray.joinToString ())
    println(nullarray)



}