package com.rsk

fun main (args: Array<String>) {
    var scores = 1000
    var i = 0
    while (scores >= 10 && i != 0) {
        scores += i
        --i
    }
    println("sum = $i")
}


