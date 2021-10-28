package com.rsk.com.rsk.`100DaysOfGADs`.Day6

// Protected Typpe Modifiers

open class Base{
    open protected val i = 5
}
class Another: Base(){
    fun getValue(): Int{
        return i
    }
    override val i = 19
}