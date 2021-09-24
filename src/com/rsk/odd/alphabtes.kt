package com.rsk.com.rsk.odd

fun main(){
    val c = 'r'
    val result = if (checkAlphabet(c)){
        "Alphabet"
    }else{
        "Not Alphabet"
    }
    println("Character is $result")
}
private  fun checkAlphabet(character: Char): Boolean{
    return  when{
((character in 'a'.. 'z') || (character in 'A'..'Z')) -> true
        else -> false
    }
}