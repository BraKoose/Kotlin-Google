package com.rsk.com.rsk.`100DaysOfGADs`.Day5

fun main (args: Array<String>) {
    println(::x.get())
    println(::x.name)
    println(::y.set(10))
        println(y)
}

val x = 5
var y = 5
