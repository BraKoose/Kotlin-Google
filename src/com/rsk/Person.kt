package com.rsk

open class Company{
    //Classes in Kotlin
    var firs_Name: String = ""
    var last_Name: String = ""

    open fun getName():String = "$firs_Name $last_Name"
}

class Employees:Company(){
    override fun getName():String{return ""}

}
