package com.rsk

import java.lang.Exception
import java.lang.UnsupportedOperationException

interface Signatory{
    fun sign()
}

open class Person(val name:String, var age:Int) : Signatory{
 var isMarried = true

    constructor(name: String, age: Int, isMarried:Boolean):this(name, age){
        this.isMarried=isMarried
    }

    override fun sign() = println("$name aged $age can sign the documents(and their martial status is $isMarried)")
}

open class Animal (val name: String, var age: Int):Signatory{
    override fun sign() = println("$name aged $age cannot sign")
}
class tree (name: String, age: Int):Animal(name, age)

class  Student(name: String, age: Int):Person(name, age)
fun main(args: Array<String>){
    val p = Person("Koose", 36)
    val a = Animal("Elephant", 20)

    a.sign()
    p.sign()
}


