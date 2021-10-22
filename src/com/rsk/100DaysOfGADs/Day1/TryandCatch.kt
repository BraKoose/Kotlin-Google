package com.rsk.com.rsk.`100DaysOfGADs`.Day1

import com.rsk.getNumber

// Exception handling

fun main (args: Array<String>) {
    try{
        val data = 20/0  //this is the error
    } catch (e: ArithmeticException){
        println(e)
    }
    println("code below throw an exception.....")
}