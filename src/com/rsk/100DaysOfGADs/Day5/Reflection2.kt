package com.rsk.com.rsk.`100DaysOfGADs`.Day5

class Reflection2(val x: Int)
fun main(args: Array<String>){
    val prop = Reflection2::x
    println(prop.get(Reflection2(5)))
}