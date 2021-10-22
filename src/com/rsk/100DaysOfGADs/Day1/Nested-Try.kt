package com.rsk.com.rsk.`100DaysOfGADs`.Day1

import java.lang.ArithmeticException

fun main (args: Array<String>){
    val koose = intArrayOf(4, 8, 12, 16, 20, 24, 28, 32, 36, 40)
    val koko = intArrayOf(2, 0, 4, 4, 0, 8)
    try {
        for(i in koose.indices){
            try{
                println(koose[i].toString() + "/" + koko[i] + "is" + koose[i] / koko[i])
            }catch (exc: ArithmeticException){
                println("Cannot be divided by Zero")
            }
        }
    }catch (exc: ArrayIndexOutOfBoundsException){
        println("Element Not Found Gangsta")
    }

}