package com.rsk.com.rsk.ISpace100Days.Day37

fun main (args: Array<String>){
    val basket = listOf("apple", "banana", "orange")
    var iter = basket.iterator()
    while (iter.hasNext()) {
        println(iter.next())
    }
    for (i in basket) {
        println(i)
    }
}