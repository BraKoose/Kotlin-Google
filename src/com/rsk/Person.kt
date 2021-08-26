package com.rsk

import java.lang.UnsupportedOperationException

interface Signatory{
    fun sign()
}

class Person(val name:String, var age:Int) : Signatory{
    override fun sign() = println("$name aged $age can sign the documents")
}
fun main(args: Array<String>){
    val p = Person("Koose", 36)
    val a = Animal("Elephant", 20)

    a.sign()
    p.sign()
}


class Animal (val name: String, var age: Int):Signatory{
    override fun sign() = println("$name aged $age cannot sign")
}