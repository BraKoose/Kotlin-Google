package com.rsk.com.rsk.`100DaysOfGADs`.Day6

class inherentanceExample2 {

    // data member
    private var number: Int = 5

    // member function
    fun calculateSquare(): Int {
        return number*number
    }
}

fun main(args: Array<String>) {

    // create obj object of Example class
    val obj = inherentanceExample2()
    println("${obj.calculateSquare()}")

}