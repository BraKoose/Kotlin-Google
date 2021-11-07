package com.rsk.com.rsk.`100DaysOfGADs`.Day15

fun main(args: Array<String>){
    for (i in args.indices){
    println("$i ${args[i]}")
}
    val items = IntArray(2)
    items[0] = 90
    items[1] = 110

    val numbers = intArrayOf(12,11,14,80,90)

    numbers.forEachIndexed{index, element ->
println("$index is : $element")
}





}