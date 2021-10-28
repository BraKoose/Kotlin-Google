package com.rsk.com.rsk.`100DaysOfGADs`.Day6

//Visibility Modifiers

open class Base(){
    var a = 1 //public by default
    private var b = 2 // private to Base Class
    protected open val c = 3 //Visbile in the Base and the Derived Class
    internal val d = 4 // visible in the same the module
    protected fun e(){} //visbile to Base and the Dervied Class

}

class Derived : Base(){
    // a, c, d, & e() of the Base classes are visible here
    //b is not visible
    override val c = 15

}
fun main(args: Array<String>){
    val base = Base()
    //base.a and base.d are visible
    //base.b, base.c and base.e() is not visbile
    val derived = Derived()
    //derived.c  is not available
}