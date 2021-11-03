package com.rsk.com.rsk.`100DaysOfGADs`.Day11

open class Car {
    open fun run(){
        println("Car is running .......")
    }
}
    abstract class Kantanka:Car(){
        override abstract fun run()
    }
    class City: Kantanka(){
        override fun run() {
            println("Kantanka was invented in Ghana, Accra")
        }
    }
    fun main(args: Array<String>){
        val car = Car()
        car.run()
        val city = City()
        city.run()
    }