package com.rsk.com.rsk.`100DaysOfGADs`.Day1

import java.lang.NullPointerException

fun main(args: Array<String>){
    /**
     Exception handling which exceptions occurs but not handled,
     just as final always get executed in the try blocks
     **/

    try{
        val data = 5 /0
        println(data)
    }catch (e: NullPointerException){
        println(e)
    }finally {
        println("finaly block code always get executed")
    }
    println("below codes")
}