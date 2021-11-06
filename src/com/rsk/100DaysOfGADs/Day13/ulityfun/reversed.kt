package com.rsk.com.rsk.`100DaysOfGADs`.Day13.ulityfun

fun IntProgression.reversed(): IntProgression{
    return IntProgression.fromClosedRange(last, first, -step)
}

fun main (args: Array<String>) {
    println("Reserved 1")
    var range1 = 1..5
    for (x in range1.reversed()) {
        print("$x ")
    }

    println()

    println("Reversed 2")
    var range2: IntRange = IntRange(1, 5)
    for (x in range2.reversed()){
        print("$x ")
    }
    println()

    println("Reversed 3")
    var range3 = IntProgression.fromClosedRange(5, 1, -1)
    for (x in range3.reversed()){
        print("$x ")
    }
    println()
    println("Reserved 4 ")
    var range4: IntProgression = IntProgression.fromClosedRange(5, 1, -2)
    for (x in range4.reversed()){
        print("$x ")
    }
}