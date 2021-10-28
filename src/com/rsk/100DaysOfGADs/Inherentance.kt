package com.rsk.com.rsk.`100DaysOfGADs`

open class Inherentance {
    val x = 10
}
class Derived: Inherentance(){
    fun foo(){
        println("X is equal to " + x)
    }
}
fun main (args: Array<String>){
    val derived = Derived()
    derived.foo()
}