package com.rsk.com.rsk.`100DaysOfGADs`.Day12.ext


fun MutableList<Int>?.swap(index1: Int, index2:Int):Any {
    if (this == null)return "null"
    else{
        val tmp = this[index1]//'this' represents to the list
        this[index1] = this [index2]
        this[index2] = tmp
        return this
    }
}
fun main (args: Array<String>){
    val list = mutableListOf(5, 10, 15)
    println("before swapping the list: $list")
    val result = list.swap(0,2)
    println("after swapping the list: $result")
}