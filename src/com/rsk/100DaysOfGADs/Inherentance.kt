package com.rsk.com.rsk.`100DaysOfGADs`

open class Bird{
    fun fly(){
        println("flying....")
    }
}
class Duck: Bird(){
    fun swim(){
        println("swimming....")
    }
}

fun main(args: Array<String>){
    val duck = Duck()
    duck.fly()
    duck.swim()
}