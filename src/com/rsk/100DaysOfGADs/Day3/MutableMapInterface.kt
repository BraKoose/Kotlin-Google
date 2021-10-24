package com.rsk.com.rsk.`100DaysOfGADs`.Day3

import java.util.concurrent.atomic.AtomicReference

fun main (args: Array<String>){
    val mutableMap1: MutableMap<Int, String> = mutableMapOf<Int, String>(1 to "Police", 29 to "QNet", 30 to "Cote'DIvore")

    val mutableMap2: MutableMap<String, String> = mutableMapOf<String, String>("Koose" to "Koko",  "Steve Jobs" to "iPhone", "Bill Gates" to "Microsoft")
    mutableMap2.put("name", "Elon Musk")
    mutableMap2.put("Planet", "Mars")
    mutableMap2.put("Comapny", "SpaceX")
    mutableMap2.put("Other Company", "Boring")
    val mutableMap3: MutableMap<Any, Any> = mutableMapOf<Any, Any>(1 to "Hero", "Dream" to "Perseverance", "Winners" to "Don't Quit", 99 to 120)
    println(".......traverse mutable1..........")
    for (key in mutableMap1.keys){
        println("Key = ${key}, value = ${mutableMap1[key]}")
    }
    println("..........traverse mutable 3..........")
    for (key in mutableMap3.keys){
        println("Key = ${key}, value = ${mutableMap3[key]}")
    }
}