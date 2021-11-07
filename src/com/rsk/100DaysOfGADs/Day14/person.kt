package com.rsk.com.rsk.`100DaysOfGADs`.Day14

fun main (args: Array<String>){

}

abstract class Person{
    abstract var name:String
    abstract fun eat()
    open fun getHeight(){}
    fun goToSchool(){}
}

class Indian() : Person(){
    override var name: String = "Bra Koose"
    override fun eat() {

    }

}