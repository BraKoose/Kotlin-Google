package com.rsk

fun main(agrs: Array<String>){
    val num1 = 10
    val num2 = 20
    val result = if (num1 > num2) "$num1 is greater than $num2" else "$num1 is less than $num2"
    println(result)
}