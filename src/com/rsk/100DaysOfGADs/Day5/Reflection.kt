package com.rsk.com.rsk.`100DaysOfGADs`.Day5

fun main (args: Array<String>) {
    fun isPostive(s: String) = s == "kotlin" || s =="Kotlin" || s == "Google Kotlin"
    fun isPositive(x: Int) = x > 0
    val numbers = listOf(10, 99, -10, -101, -1000)
    val strings = listOf("Kotlin", "Python")

    println(numbers.filter(::isPositive))
    println(strings.filter (::isPostive))
}
