package com.rsk.com.rsk.`100DaysOfGADs`.Day1

fun main (args: Array<String>){
    /** It cast the value if possible or return null instead
    of throwing ecxception even casting is not possible**/

    val location : Any = "kotlin"
    val safeString: String? = location as?  String
    val safeInt: Int? = location as? Int
    println(safeString)
    println(safeInt)
}