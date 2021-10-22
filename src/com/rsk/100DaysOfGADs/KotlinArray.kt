package com.rsk.com.rsk.`100DaysOfGADs`


// arrayOf Function

var myArray1 = arrayOf(1, 2, 6, 9, 15)
var myArray2 = arrayOf<Int>(1, 3, 5, 7, 9, 11)
val myArray3 = arrayOf<String>("Tejas", "Koose", "Andy", "Ansh", "sumit")
val myArray4 = arrayOf(1, 10, 5, "koose", "adwoa", "bilson")

// intArrayOf FUnction

var myArray5: IntArray = intArrayOf(5, 10, 15, 20, 25)

/*

Modify and access elments of array with Set() and get() respectively

 */


//set() example

fun main (args: Array<String>){
    val array1 = arrayOf(1, 3, 5, 7, 9)
    val array2 = arrayOf<Long>(11, 12, 13, 14, 15)
    array1.set(0, 5)
    array1[2] = 100

    array2.set(2, 10)
    array2[3] = 16

    for(element in array1){
        println(element)
    }
    println()

    for (element in array2){
        println(element)
    }
}