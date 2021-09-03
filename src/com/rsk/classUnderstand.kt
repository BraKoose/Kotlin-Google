package com.rsk

    fun main(args: Array<String>){
        var number = 4
        var numberProvided= when(number){
            1 -> "Uni"
            2 -> "Deux"
            3 -> "Trio"
            4 -> "Quatre"
            5 -> "Cinq"
            else -> "Invalid Lucky number"
        }
        println("You provided $numberProvided and Its is a Good")
    }


