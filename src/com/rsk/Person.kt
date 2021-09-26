package com.rsk

import java.lang.ArithmeticException
import java.lang.NumberFormatException

interface  Signatory {
    fun sign()
}
open class Person(val name: String, var age: Int, var isMarried: Boolean = false) : Signatory {
    var partnername: String =  ""

    override fun sign() = println(" $name is $isMarried aged $age can sign  Documents ")

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val str = getNumber("100.5")
                println(str)
            val g = Person("Koose", 22, true)

            g.sign()
            g.age = 92
            g.sign()
            g.partnername = "Faz"
            println("Partners name is ${g.partnername}")
            g.partnername = "Gideon"
            println("Partners name is ${g.partnername}")
            try{
                val data = 20/0
            }catch (e: NumberFormatException){
                0
            }
            println(  "code below exception "  )
            }


    }

}

fun getNumber(str: String): Int{
    return try{
        Integer.parseInt(str)
    }catch (e:ArithmeticException){
        0
    }
}

class Student(name:String, age:Int):Person(name, age)

data class user( var name: String, var id:Int)

fun main(args: Array<String>){
    val b = Person("Koose", 20, true)
    b.sign()

    b.age = 100
    b.sign()

    val kevin = user("koose", 1)
    println(kevin)
    val (name, id) = kevin
    println("User name is $name and with the id $id")

}
