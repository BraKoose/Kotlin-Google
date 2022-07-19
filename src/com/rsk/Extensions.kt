package com.rsk

fun main(agrs: Array<String>){
    //Extension Functions
    val text = "We  Don't BREAK \t STreAks"
    val p = 42
    val k = 90
    println(p.kooseMaths())
    println(k.kooseMaths())
    println(text.replaceStreak())

}

fun  String.replaceStreak():String{
    val regex = Regex("\\s+")
    return regex.replace(this, " ")
}

fun Int.kooseMaths(): Int{
    val number = Math.max(10, 20)
    return number.compareTo(100)
}