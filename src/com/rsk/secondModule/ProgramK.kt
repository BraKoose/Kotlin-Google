package com.rsk.com.rsk.secondModule

fun main (args: Array<String>){
    var program = Program()
    var total = 0
    //program.fibonnaci(20)
    program.fibonnaci(12) {it -> total += it}

    println(total)
}

interface Process{
    fun execute(value:Int)
}

class Program{
    fun fibonnaci(limit: Int, action:(Int)-> Unit){
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit){
            action(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }
}
