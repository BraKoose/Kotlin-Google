package com.rsk

import java.util. *

fun main(args: Array<String>){
    val read = Scanner(System.`in`)
    println("Enter Any Number : ")
    var a = read.nextInt()
    println("Enter Second Any Number: ")
    var b = read.nextInt()

    println("Before swap: a = $a, b: $b")

    // swapping variables using 3 variable
    a -= b
    b += a
    a = b - a
    println("After Swap: a = $a, b: $b")
}

