package com.rsk

abstract class Company{
    //Classes in Kotlin
    var firs_Name: String = ""
    var last_Name: String = ""

    open fun getName():String = "$firs_Name $last_Name"
    abstract fun getAddres():String
}

class Employees:Company(){
    override fun getName():String{return ""}
    override fun getAddres(): String {
        return " "
    }

}
class Person(val pets:MutableList<Pet> = mutableListOf())
class Pet {
    constructor(owner : Person){
        owner.pets.add(this)
    }
}

open class Shape {
    open val circle:Double = Math.PI
}
class Rectangle : Shape(){
    override val circle = 10.0
}