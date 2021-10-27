package com.rsk.com.rsk.`100DaysOfGADs`.Day5

class Constructors(password: String){
    constructor(name: String, id: Int, password: String):this(password){
        println("Name = ${name}")
        println("ID - ${id}")
        println("Password = ${password}")
    }
}
fun  main (args: Array<String>){
    val myclass = Constructors("Koose", 456, "pussy")
}