package com.rsk.com.rsk.`100DaysOfGADs`.Day2

fun main (args: Array<String>){
/*
Mutable list can be declared as empty and later add up. This time around all kinds
of Data Types
 */
    var listNumber: MutableList<Int> = mutableListOf<Int>()
    var MlistString: MutableList<String> = mutableListOf<String>()
    var AnyGangster: MutableList<Any> = mutableListOf<Any>()

    listNumber.add(100)
    listNumber.add(89)
    listNumber.add(67)
    listNumber.add(2, 10)

    MlistString.add("Tonto",)
    MlistString.add("Amoateng")
    MlistString.add("Bullet")
    MlistString.add("Koo")
    MlistString.add("Doctor, Doctor")

    AnyGangster.add("Kooko")
    AnyGangster.add(2.19)
    AnyGangster.add("Weed")

    println()
    println("......... print String type ......")
    for (words in MlistString){
        println(words)
    }
    println()
    println(".........print Number Type ..........")
    for(numbers in listNumber){
        println(numbers)
    }
    println()
    println(".....print any gangster type.........")
    for( shattaWale in AnyGangster){
        println(shattaWale)
    }

}