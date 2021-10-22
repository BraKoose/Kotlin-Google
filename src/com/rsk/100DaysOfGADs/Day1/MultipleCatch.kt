package com.rsk.com.rsk.`100DaysOfGADs`.Day1

import java.lang.Exception

fun main(args: Array<String>){
    try{
        val a = IntArray(5)
        a[5] = 10/0
    }
    catch (e: Exception){
        println("parents Exception catch")
    }
    catch (e: ArithmeticException){
        println("arthimethic exception catch")

    }catch (e: ArrayIndexOutOfBoundsException){
        println("ArrayIndexOutOfBounds exception catch")
    }

    println("Code after try and catch multiple times")
}