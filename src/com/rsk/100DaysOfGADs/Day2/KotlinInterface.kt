package com.rsk.com.rsk.`100DaysOfGADs`.Day2

// listOf() function example

fun main (args: Array<String>){
    var list = listOf("Koose", "Koko", "Ganduff") //read-only, fixed-size
    for(elements in list){
        println(elements)
    }
}