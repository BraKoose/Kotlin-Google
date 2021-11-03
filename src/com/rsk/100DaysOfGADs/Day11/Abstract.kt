package com.rsk.com.rsk.`100DaysOfGADs`.Day11

abstract class Car{
    abstract fun run()
}
class Kantanka: Car(){
    override fun run() {
        println("Kantanka is running safely.")
    }
}
fun main(args: Array<String>){
    val obj = Kantanka()
    obj.run()
}