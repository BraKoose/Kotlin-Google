package com.rsk.com.rsk.`100DaysOfGADs`.Day1

//Example of accessing String elements




fun main(args: Array<String>){
    val str = "Hello GADs 2021!"
    println(str[0])
    println(str[1])
    println(str[str.length-1])

    //Example of String Templates $ thingy
    var k = 10
    print("k = $k")
    println()

    //example of String Template as arbitrary expression in curly braces
    val name = "koose"
    println("$name is a computer doctor, which its name length is ${name.length}")

    // String template in raw string
    val a = 10
    val b = 5
    val myString = """value $a
        |is greater than value $b
    """.trimMargin()
    println("${myString.trimMargin()}")
}
