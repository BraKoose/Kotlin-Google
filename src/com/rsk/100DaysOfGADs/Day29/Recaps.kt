package com.rsk.com.rsk.`100DaysOfGADs`.Day29

import java.util.Arrays

fun main(args: Array<String>){
    val numberArray: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    var reservedArray = numberArray.reversedArray()
    println(Arrays.toString(reservedArray))
}

