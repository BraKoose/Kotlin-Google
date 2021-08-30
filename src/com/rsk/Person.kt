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

interface Shape{
    val circle : Double
}
class Rectangle(override val circle: Double = 10.0): Shape

class Polygon: Shape{
    override var circle: Double = 13.9
}