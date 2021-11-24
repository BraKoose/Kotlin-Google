package com.rsk.com.rsk.`100DaysOfGADs`.Day30

import java.util.*

fun main(){
    val read = Scanner(System.`in`)
    println("Enter a number of terms: ")
    val number = read.nextInt()

    var t1 = 0

    var t2 = 1

    println("\nFibonnaci series of $number terms: ")

    for ( index in 1 .. number){
        println("$t1")

        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }
}