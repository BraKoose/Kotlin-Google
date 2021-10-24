package com.rsk.com.rsk.`100DaysOfGADs`.Day3

fun main (args: Array<String>){
// For specific we can provide genric types
    val myMap: Map<Int, String> = mapOf<Int, String>(1 to "Koose", 2 to "Koko", 3 to "Learn")
    for (key in myMap.keys){
    println("elements at the key $key = ${myMap.get(key)}")
    }
}