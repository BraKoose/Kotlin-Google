package com.rsk.com.rsk.`100DaysOfGADs`.Day13.ulityfun

fun main (args: Array<String>){
    val range: IntRange = 1..10
    println("Print range value with step2 : ")
    for (x in range step (2)){
        print("$x ")
    }
    println(" ")

    println("Print range value with step3 : ")
    for (x in range step 3){
        print("$x ")
    }
    val first = ((range step 2).first)
    val last = ((range step 2).last)
    println("")
    println("First value of interval: $first")
    println("Second Value of interval: $last")
}