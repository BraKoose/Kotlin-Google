package com.rsk

fun main(agrs: Array<String>) {
    val num1 = 10
    val num4 = 200
    val num2 = 20
    val result = if (num1 > num2 + num4) {
        "Kosse is smart"
    } else if (num1 * 10 > num2 + num4){

        "I believe me "
    }else{
        "We are expert in Disguise"
    }

    println(result)
}