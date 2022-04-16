package com.rsk.com.rsk.ISpace100Days.Day37

fun main(args: Array<String>){
    val ints = (1..100).toList()

    val evenInts2 = mutableListOf<Int>()
    for (i in ints) {
        if (i % 2 == 0) {
            evenInts2.add(i)
        }
    }
    println(evenInts2)

    val squaredInt2 = mutableListOf<Int>()
    for (i in evenInts2){
        squaredInt2.add(i * i)
    }
    println(squaredInt2)
    // rewrite of for loops in lambadas
    evenInts2.forEach { squaredInt2.add(it * it) }
}