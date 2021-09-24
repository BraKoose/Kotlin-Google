package com.rsk

import java.util. *

fun main(args: Array<String>){
    val read = Scanner(System. `in`)
    println("Enter Your number: ")
    val firstName=read.nextInt()
    println("Enter Your Age: ")
    val lastName=read.nextInt()

    val sum = firstName + lastName

    println("sum = $sum")
}

