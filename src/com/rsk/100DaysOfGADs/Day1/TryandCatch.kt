package com.rsk.com.rsk.`100DaysOfGADs`.Day1

import com.rsk.getNumber

fun main (args: Array<String>) {

    // String value to int which does not generate any exception and returns

    val str = getNumber("10")
    println(str)
    fun getNumber(str:String): Int{
        return try {
            Integer.parseInt(str)
        }catch (e: ArithmeticException){
            0
        }
    }
}