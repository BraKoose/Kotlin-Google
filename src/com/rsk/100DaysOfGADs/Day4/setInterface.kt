package com.rsk.com.rsk.`100DaysOfGADs`.Day4

//we create a set of int, type non generic and another generic set of Any Type
fun main(args: Array<String>) {
    val intSet = setOf(1, 2, 4, 7, 7, 2002, 20)
    val mySet: Set<Any> = setOf(2, 5, 5, 7, 12, "Koose", "Nickolas")

    println(".....print Any Set/......." )
    for (key in mySet){
        println(key)
    }
    println(".........print mySet.elementat(3)......")
    println(mySet.elementAt(3))
    println(".......print mySet.ElementAtOrNull(8).....")
    println(mySet.elementAtOrNull(5))
    }
