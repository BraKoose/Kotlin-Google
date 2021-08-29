package com.rsk

fun main(agrs: Array<String>){
    //Extension Functions
    val text = "We  Don't BREAK \t STreAks"
    var p = 42
    var k = 90
    println(p.kooseMaths())
    println(k.kooseMaths())
    println(text.replaceStreak())

}

fun  String.replaceStreak():String{
    var regex = Regex("\\s+")
    return regex.replace(this, " ")
}

fun Int.kooseMaths(): Int{
    var number = Math.max(10, 20)
    return number.compareTo(100)
}