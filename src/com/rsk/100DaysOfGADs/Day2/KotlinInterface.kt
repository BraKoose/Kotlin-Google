package com.rsk.com.rsk.`100DaysOfGADs`.Day2

// listOf(), we can pass different types of data at the same time.
//List  can also traverse the list using index range

fun main (args: Array<String>){
    var list = listOf(1,2,3, "Koose", "Scriptures", "LGBT")
    for (elements in list){
        println(elements)
    }
    println()
    for(index in 0 ..list.size-1){
        println(list[index])
    }
}