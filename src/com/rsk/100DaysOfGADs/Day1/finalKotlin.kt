package com.rsk.com.rsk.`100DaysOfGADs`.Day1

import java.lang.NullPointerException

fun main(args: Array<String>){
    /**
     Exception handling which exceptions occurs and handled,
     **/

    try{
        val data = 5 /0
        println(data)
    }catch (e: ArithmeticException){
        println(e)
    }finally {
        println("finaly block code always get executed")
    }
    println("below codes")
}

/*
* Please Note : The finally block will not be executed if programs exits(either
* by calling exitProcess(int) or any error that causes the process to abort
* */