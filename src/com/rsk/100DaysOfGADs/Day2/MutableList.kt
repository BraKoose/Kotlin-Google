package com.rsk.com.rsk.`100DaysOfGADs`.Day2

fun main (args: Array<String>){
    var mutableList = mutableListOf("Koose", "Chess", "Maths")

    for(elements in mutableList){
        println(elements)
    }
    println()
    for (index in 0..mutableList.size-1){
        println(mutableList[index])
    }
}