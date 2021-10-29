package com.rsk.com.rsk.`100DaysOfGADs`.Day7.Building

class Apartment(
        override var owner:String,
        override val rooms: Int,
        override val bathrooms: Double,
        override var color: String,
        price: Double,
        tenants: Map<Int, String>
):Building(price){
    var tenants = mapOf<Int, String>()

    init {
        this.tenants = tenants
    }
    fun tenantsInfo(id: Int){
        if (tenants[id] != null){
            println("Current tenants is ${tenants[id]} ")
        }else{
            println("No current tenants here")
        }
    }

}