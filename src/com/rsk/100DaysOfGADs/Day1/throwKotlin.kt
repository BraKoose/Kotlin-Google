package com.rsk.com.rsk.`100DaysOfGADs`.Day1

import kotlin.ArithmeticException

fun main(args: Array<String>) {
    validate(15)
    println("code after validation")
}
fun validate (age: Int){
    if (age < 18)
        throw ArithmeticException("under dude")
    else
        println("eligible to smoke and drink")

}