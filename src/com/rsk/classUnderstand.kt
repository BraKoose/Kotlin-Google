package com.rsk

class InitOrderDemo(name: String){
    val firsthobby = "Reading : $name".also(::println)

    init {
        println("Second habit that prints $name")
    }

    val thirdMe = "Third Me : ${name}".also (::println)

    init {
        println("Third Me prints all habits ${name.length}")
    }

}

