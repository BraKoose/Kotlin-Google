package com.rsk.com.rsk.`100DaysOfGADs`.Day1


// Generation an exception and return the statements of catch block

fun main (args: Array<String>) {
    val str = getNumber("10.5")
    println(str)
    }
    fun getNumber(str:String): Int{
        return try{
            Integer.parseInt(str)
        }catch (e: NumberFormatException){
            0
        }
    }
