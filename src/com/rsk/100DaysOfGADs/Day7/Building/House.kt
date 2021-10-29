package com.rsk.com.rsk.`100DaysOfGADs`.Day7.Building

class House(
        override  var owner: String,
        override val rooms: Int,
        override val bathrooms: Double,
        override var color: String, marketplace: Double
): Building(marketplace){
    override fun ownerPrompt() {
        println("Hey mr $owner")
    }
}