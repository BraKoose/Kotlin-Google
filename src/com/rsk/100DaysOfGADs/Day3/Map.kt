package com.rsk.com.rsk.`100DaysOfGADs`.Day3

fun main (args: Array<String>) {
// For specific we can provide NON - genric types
    val myMap: Map<Int, String> = mapOf<Int, String>(1 to "Kofi Strait", 10 to "Maa Lucy", 100 to "Johnny Stupid")
    for (key in myMap.keys) {
        println("ELements at the key $key = ${myMap.get(key)}")
    }
    println("....myMap.plus(Pair(100 /Johnny Stupdi)......")
    for (m  in myMap.plus(Pair(5, "DAD stupid"))){
        println("Elements at key  ${m.key} = ${m.value}")
    }
}
