package com.rsk

fun main(agrs: Array<String>){
    //Extension Functions
    val text = "We  Don't BREAK \t STreAks"
    println(replaceStreak(text))
}

fun  replaceStreak(value:String):String{
    var regex = Regex("\\s+")
    return regex.replace(value, " ")
}