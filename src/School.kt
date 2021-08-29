@file:JvmName("log")
package com.rsk

fun main(args: Array<String>){
    log(message = "Koose o ")
}

@JvmOverloads
fun log(message:String, loglevel: Int= 30):Boolean{
    println(message + loglevel)
    return true
}

