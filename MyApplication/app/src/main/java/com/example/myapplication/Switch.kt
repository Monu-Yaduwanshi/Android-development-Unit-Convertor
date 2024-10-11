//package com.example.myapplication
//
//fun main(){
//    println("Enter")
//    var ch : Char = readln().first();
//    var ans = when(ch){
//        'a','e','i','o','u' -> "Vowel"
//        else -> "Cosonant"
//    }
//    println(ans)
//}

package com.example.myapplication

fun main(){
    println("Enter")
    var ch : Char = readln().first();
    var ans = when(ch) {
        'a' -> "vowel"
        'e' -> "vowel"
        'i' -> "vowel"
        'o' -> "vowel"
        'u' -> "vowel"
        else -> "consonant"
    }
    println(ans)

    }