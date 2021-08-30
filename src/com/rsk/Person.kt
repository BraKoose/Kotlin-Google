package com.rsk

abstract class Company{
    //Classes in Kotlin
    var firs_Name: String = ""
    var last_Name: String = ""

    open fun getName():String = "$firs_Name $last_Name"
    abstract fun getAddres():String
}

class Employees:Company(){
    override fun getName():String{return ""}
    override fun getAddres(): String {
        return " "
    }

}
