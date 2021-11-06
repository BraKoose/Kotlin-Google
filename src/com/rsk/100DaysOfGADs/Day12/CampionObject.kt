package com.rsk.com.rsk.`100DaysOfGADs`.Day12

class myClass {
    companion object{
        fun  create():String{
            return "Calls create method of compainion object"
        }
    }
}
fun main (args: Array<String>){
    val instatnce = myClass.create()
    println(instatnce)
}