package com.rsk.com.rsk.`100DaysOfGADs`.Day2

/*Example 4 lets see the use of different functions of Kotlin list
*Interface using ListOf<T>() funcyion
*  */

fun main (args: Array<String>){
    var StringList: List<String> = listOf<String>("Koose", "404 Solutions", "Trotro")
    var list: List<String> = listOf<String>("Jesus", "Slave Ship", "Christianity")
    for(elements in StringList){
        println(elements + " ")
    }
    println()
    println(StringList.get(0))
    println(StringList.indexOf("404 Solutions"))
    println(StringList.size)
    println(StringList. lastIndexOf("Koose"))
    println(StringList.contains("Trotor"))
    println(StringList.containsAll(list))
    println(StringList.subList(1,2))
    println(StringList.isEmpty())
    println(StringList.drop(1))
    println(StringList.dropLast(2))
}