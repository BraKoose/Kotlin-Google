package com.rsk.com.rsk.`100DaysOfGADs`.Day11

data class dataclass (var name: String = "Ama", var id: Int, var email:String)

fun main(args: Array<String>){
    val u = dataclass("Koose", 90, "KooseTheBloogger@gmail.com")
    println(u)
}

data class Product(var item: String, var price:Int)
