package com.rsk.com.rsk.`100DaysOfGADs`.Day1

fun main( args: Array<String>) {
    // The use of "is" in cast
    val obj: Any = "404 Solutions is the startup that made the legacy Trotro App"
    if (obj !is String) {
        println("obj is not a string")

    } else
    //No explicit casting needed
        println("String length is ${obj.length}")
}