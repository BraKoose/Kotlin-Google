package com.rsk.com.rsk.odd

fun main(){
    println("enter an Alphabet: ")
    val input1 = readLine()
    val charToCheck = input1!!.toCharArray()[0]

    val result = if(
            (charToCheck == 'a')
                || (charToCheck == 'e')
                || (charToCheck == 'i')
                || (charToCheck == 'o')
                || (charToCheck == 'u')
                || (charToCheck == 'A')
                || (charToCheck == 'E')
                || (charToCheck == 'I')
                || (charToCheck == 'O')
                || (charToCheck == 'U')
    )
        "vowel"
    else
        "Consonant"

    println("Character ($charToCheck) is $result")
}