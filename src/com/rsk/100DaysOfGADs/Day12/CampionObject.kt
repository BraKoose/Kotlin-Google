package com.rsk.com.rsk.`100DaysOfGADs`.Day12

class myclass{
    companion object{
        fun create():String{
            return "calling create method of campanion objects"
        }
    }
}

fun myclass.Companion.Koose(){
    println("execute extension of campnion objects")
}
fun main (args: Array<String>){
    myclass.Koose()
}