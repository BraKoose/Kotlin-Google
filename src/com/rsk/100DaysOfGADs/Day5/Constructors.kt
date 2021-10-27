package com.rsk.com.rsk.`100DaysOfGADs`.Day5

class Constructors(name : String, id: Int) {
    val e_name:String
    var e_id: Int

    init {
        e_name = name.capitalize()
        e_id = id

        println("Name = ${e_name}")
        println("ID  = ${e_id}")
    }

}

fun  main (args: Array<String>){
    val myclass = Constructors("Koose", 456)
}