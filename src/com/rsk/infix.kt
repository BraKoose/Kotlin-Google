package com.rsk

fun main (agrs: Array<String>){
    //Infix Functions
    val h1 = Header("KooseH1")
    val h2 = Header("KooseH2")
    val h3 = h2 plus h1

    println(h3.name)
}

class Header(var name: String){}

infix fun Header.plus(other: Header) :Header {
    return Header(this.name)
}