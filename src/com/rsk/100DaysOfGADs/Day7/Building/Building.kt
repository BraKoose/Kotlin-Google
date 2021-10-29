package com.rsk.com.rsk.`100DaysOfGADs`.Day7.Building

open class Building {
    open var owner: String = " "
    open val rooms: Int = 0
    open val bathrooms: Double = 0.0
    open var color: String = "White"

    open fun ownerPrompt(){
        println("Welcome, Mr $owner")
    }
}