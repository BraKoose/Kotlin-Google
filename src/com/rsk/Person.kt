package com.rsk

import java.lang.UnsupportedOperationException

interface Signatory{
    fun sign()
}

class Person : Signatory{
    override fun sign() = println("i can sign the documents")
}

fun main(agrs: Array<String>){
    val p = Person()
    p.sign()
}