package com.rsk.com.rsk.`100DaysOfGADs`.Day1

import java.lang.IllegalArgumentException

fun main(args: Array<String>){
    val StationName:String = station()
    println(StationName)
}
fun station(): String{
    val str: String? = "Niit"
    val strLength: Int = if (str != null) str.length else -1
    val strLength2: Int = str?.length ?: -1
    var string = "str = $str\n" +
            "strLength = $strLength\n" +
            "strLength2 = $strLength2\n\n"

    fun check(textOne: String?, textTwo:String?): String?{
        val textOne = textOne?: return null
        val textTwo = textTwo?: IllegalArgumentException("text exception")

        return "\ntextOne = $textOne\n" +
                "textTwo = $textTwo\n"
    }
    string += "check(null, \"Sofoline Western Pass\") = ${check(null, "Sofoline Western Pass")}\n" +
            "check(\"Sofoline Twedie\", \"Sofoline Western Pass\") = ${check("Sofoline Twedie", "Sofoline Western Pass")}\n"
    return  string


}
