package com.rsk.com.rsk.`100DaysOfGADs`.Day1

fun main(args: Array<String>){

    // null types of strings in If statements to show nullabilty
    var str: String? = "Kooose"
    var len = if(str != null) str.length else -1
    println("str is : $str")
    println("str length is : $len")

    str = null
    println("str is : $str")
    len = if (str != null) str.length else -1
    println("b length is : $len")
}