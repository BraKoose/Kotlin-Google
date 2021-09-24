package com.rsk.odd

import java.util. *

fun main (args: Array<String>){
    val read = Scanner(System.`in`)
    println("Enter any number: ")
    val a = read.nextDouble()
    val isEven = ((a % 2 )== 0.0)

    val res = "Entered this value $a is " + (if (isEven) "even" else "Odd")
    println(res)
}

