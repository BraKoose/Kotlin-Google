package com.rsk.com.rsk.`100DaysOfGADs`.Day11

data class dataclass (var name: String, var id: Int, var email:String)

fun main(args: Array<String>){
    val u = dataclass("Koose", 90, "KooseTheBloogger@gmail.com")
    val p = Product("Netflix", 50)
    val p2 = Product("Gym", 1)
    val p3 = Product("Gym", 1)
    println(p)
    println(p ==p2)
    println(p2.equals(p3))
    println(u)
}

data class Product(var item: String, var price:Int)
