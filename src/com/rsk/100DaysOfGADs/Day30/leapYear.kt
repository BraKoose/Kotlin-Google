package com.rsk.com.rsk.`100DaysOfGADs`.Day30

import java.util.*

//main mthd
fun main (args: Array<String>){
    //input stream through Scanner.jv
    var reader = Scanner(System.`in`)

    //input the Integer Value
    println("Enter Year : ")
    var year = reader.nextInt()

    //checking leap year condition

    var isleap = if(year % 4 == 0){
        if (year % 100 == 0){
            //Century Year must be divided by 400 for leap year
            year    % 400 == 0
        }else true
    }else false

    println("$year is ${if (isleap) "Leap year " else "Not a leap Year " }  ")
}