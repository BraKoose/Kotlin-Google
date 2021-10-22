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

    val text = """Kotlin is offical language
        |annouced by Google for 
        |android application development
    """
    println(text)
    val text2 = """Kotlin is offical language
        |annouced by Google for 
        |android application development
    """.trimMargin()
    println(text2)

    //Structural Equity
    val str1 = "Hello Koose!"
    val str2 = "Hello Koose!"
    println(str1 == str2) //T

    println(str1 != str2) //F

    //Referential equality

    val str3 = buildString { "Koose is King" }
    val str4 = buildString { "Koose is King" }

    println(str3 === str4)
    println(str3 !== str4)

}
