package com.rsk.com.rsk.`100DaysOfGADs`.Day29

fun main(){
    val givenArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    //using fold method
    println(givenArray.fold(0 ){acc, i -> acc + i  })
}

