package com.rsk.com.rsk.`100DaysOfGADs`.Day2

/*For more specific, we provide the generic types of list
* such as listOf<int>(), ListOf<String>(),listOf<Any>
* */

fun main (args: Array<String>){
    var intList: List<Int> = listOf<Int>(1, 2, 7)
    var StringList: List<String> = listOf<String>("404 Solutions", "Clade", "Trotro", "Highway")
    var anyList: List<Any> = listOf<Any>(1, "Dada Koose", 209, "404 Solutions", 9090, "Love Kotlin")
    println("Print int List ")
    for(element in intList){
        println(element)
    }
    println()
    println("Print String List")
    for (words in StringList){
        println(words)
    }
    println()
    println("Print Any List ")
    for (anybody in anyList){
        println(anybody)
    }
}