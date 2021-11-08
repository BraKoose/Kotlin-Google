package com.rsk.com.rsk.`100DaysOfGADs`.Day16

val action = { println("Hello, Koose")}
val calc : (Int, Int) -> Int = {x, y -> x * y}


fun main(args: Array<String>){
    oktry(action)
    doit(calc)
}

fun oktry(func: () -> Unit){
    func()
}

fun doit(func: (Int, Int) -> Int){
    func(10, 10)
}