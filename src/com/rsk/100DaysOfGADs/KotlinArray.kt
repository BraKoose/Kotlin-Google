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
    val array3 = arrayOf(101, 102, 103, 104, 105, 106)
    val array4 = arrayOf<Long>(111, 112, 113, 114, 115, 116)
    val name = arrayOf<String>("Koose", "koko", "Gideon", "Akala", "Atw3yaa")
    val myArray2 = arrayOf(1, 4, 5, "404 Solutions", "Trotro ")
    val myArray3: IntArray = intArrayOf(5, 50, 10, 100, 20, 200)
    array1.set(0, 5)
    array1[2] = 100

    array2.set(2, 10)
    array2[3] = 16

    for(element in array1){
        println(element)
    }
    println()
    for (elements in name){
        println(elements)
    }
    println()
    for(element in myArray2){
        println(element)
    }
    println()
    for(elements in myArray3) {
        println(elements)
    }
    println()
    for (element in array2){
        println(element)
    }




    /*
    we are simply initialize an array of the size 5 with default value as 0 and traverse its elements.
     */
    var myArray = Array<Int>(5){0}

    myArray[1] = 1000
    myArray[3] = 15
    for(element in myArray){
        println(element)
    }


// array get() function example

    println(array3.get(0))
    println(array3[2])
    println()
    println(array4.get(2))
    println(array4[3])
}