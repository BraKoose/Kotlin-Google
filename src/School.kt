package com.rsk

import kotlin.math.max

fun main(args: Array<String>){
    display("Koose o ")
    println(Kmaths(20, 30))
}


fun display(message:String):Boolean{
    println(message)
    return true
}

fun Kmaths(a: Int, b:Int): Int = if (a > b) a else b