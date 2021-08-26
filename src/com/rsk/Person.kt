package com.rsk

import java.lang.Exception
import java.lang.UnsupportedOperationException

interface Signatory{
    fun sign()
}

open class Person(val name:String, var age:Int, var  isMarried:Boolean =false) : Signatory{

 var partnerName:String = ""
    override fun sign() = println("$name aged $age can sign the documents(and their martial status is $isMarried)")
}

open class Animal (val name: String, var age: Int):Signatory{
    override fun sign() = println("$name aged $age cannot sign")
}
class tree (name: String, age: Int):Animal(name, age)

data class User(val name: String, val email: String, var pNumber:Int)

class  Student(name: String, age: Int):Person(name, age)
fun main(args: Array<String>){
    val p = Person("Koose", 36)
    val a = Animal("Elephant", 20)
    p.partnerName = "Adwoa"
    a.sign()
    p.sign()

    println("Partner name is ${p.partnerName}")
    var koose = User("Godfred", "KooseTheBlogger@gmail.com",0)
    println(koose)
    val (name, email, pNumber) = koose
    println("User is $name and email is $email with the Phone Number of $pNumber")

    val otherUser = koose.copy(email="404Solutions@gmail.com")
    println(otherUser)
}


