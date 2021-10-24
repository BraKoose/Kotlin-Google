package com.rsk.com.rsk.`100DaysOfGADs`.Day3

fun main (args: Array<String>){
// For specific we can provide NON - genric types
    val myMap = mapOf(1 to "Godfred", 4 to "Addai", 10 to "Kayna City", "Kejetia" to "Asuofua", "Abrepo" to 9)
    for(key in myMap.keys){
    println("Elements at key $key = ${myMap.get(key)}")
    }
}