package com.rsk

fun main (agrs: Array<String>){
    //Infix Functions
    val h1 = Header("KooseH1")
    val h2 = Header("KooseH2")
    val h3 = h2 plus h1
    val h4 = h3 + h2

    println(h3.name)
    println(h4.name)
}

class Header(var name: String){}

operator infix fun Header.plus(other: Header) :Header {
    return Header(this.name)
}