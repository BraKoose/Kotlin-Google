package com.rsk.com.rsk.`100DaysOfGADs`.Day3

fun main (args: Array<String>){
    val myMap = mapOf<Int, String>(1 to "Amoateng", 2 to "Tonto", 3 to "Weed")
    for (key in myMap.keys){
        println(myMap[key])
    }
}
