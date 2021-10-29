package com.rsk.com.rsk.`100DaysOfGADs`.Day6.patent

open class patent {

    constructor(name: String, id :Int){
        println("executes super constructor $name, $id")
    }

    constructor()

}

class Child : patent{
    constructor(name: String, id: Int, dept:String) : super() {
        println("executes child class constructors with propertys $name, $id, $dept")

    }
}
fun main (args: Array<String>){
    val child = Child("koose", 20, "Google Developer Assocciate")
    
}