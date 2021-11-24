package com.rsk.com.rsk.`100DaysOfGADs`.Day30

import java.util.*

fun main(){
    val read = Scanner(System.`in`)

    println("Enter N : ")

    val number = read.nextInt()

    var sum = 0


    for (i in 1..number){
        sum += (i * i)

    }
    println("\nSum of Squares of $number natural numbers : $sum")
}
