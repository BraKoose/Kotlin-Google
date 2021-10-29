package com.rsk.com.rsk.`100DaysOfGADs`.Day7.Building

fun main(args: Array<String>){
    var house = House("Koose", 10, 2.5, "Blue", marketplace = 10.1)
    house.ownerPrompt()
    val apartment = Apartment("Koose", 101, 20.1, "White", 1000.0, mapOf(101 to "Koose"))
    apartment.tenantsInfo(101)
}