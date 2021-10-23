package com.rsk.com.rsk.`100DaysOfGADs`.Day2

fun main (args: Array<String>){
/*
Mutable list can be declared as empty and later add up.
 */
    var mutablelist1 = mutableListOf("Koose", "404 Solutions")
    mutablelist1.add("Tonto")
    mutablelist1.add("Mr Bonny")

    var mutableList2 = mutableListOf<String>()
    mutableList2.add("Kayna City")
    mutableList2.add("Alonso")
    mutableList2.add("Derrick Adu")

    for (elements in mutablelist1){
        println(elements)
    }
    println()
    for(badboys in mutableList2){
        println(badboys)
    }
}