package com.rsk

class Person(var name:String, var age: Int) {
    fun display(){
        println("Display: $name")
    }
    fun displayWithLambda(func: (s:String) -> Unit){
        func(name)
    }
}