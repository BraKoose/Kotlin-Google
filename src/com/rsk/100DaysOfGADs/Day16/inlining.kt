package com.rsk.com.rsk.`100DaysOfGADs`.Day16

import java.lang.Exception

fun main(agrs: Array<String>) {
    val ints = listOf(1,2,3,4,5,6,7)
    val i = first(ints, {i -> i ==7})
    println(i)
}


fun <T> first(items: List<T>, predicate:(T) -> Boolean):T{
    for(item in items){
        if (predicate(item)) return item
    }
    throw Exception()
}