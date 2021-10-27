package com.rsk.com.rsk.`100DaysOfGADs`.Day5

fun main (args: Array<String>){
    val numbers = listOf(-10, 1, -12, 2, 2)
    fun isPositive(x: Int)=x>0
    println(numbers.filter(::isPositive))
}
