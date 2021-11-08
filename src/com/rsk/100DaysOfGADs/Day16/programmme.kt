package com.rsk.com.rsk.`100DaysOfGADs`.Day16

fun main(args: Array<String>){
    var names:List<String> = listOf("Joe Smith", "Tejas", "Andy")
    val name = names.itemAt(2)
    println(name)

    val n:Node<Int> = Node(30)
    println(n.value())
}

fun <T> List<T>.itemAt(ndx:Int):T{
    return this[ndx]
}

class Node<T>(private val item:T){
    fun value():T{
        return item
    }
}