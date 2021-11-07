package com.rsk.com.rsk.`100DaysOfGADs`.Day14

import kotlin.math.exp

abstract class Employees (val name:String, val exprience:Int){
    abstract var salary: Double
    abstract fun dateOfBirth(date:String)

    fun EmployeesDetails(){
        println("This is name of Employee name $name")
        println("THis is the employee Exprience $exprience ")
        println("The Annual Salary: $salary")
    }
}

class Engineer(name: String, exprience: Int): Employees(name, exprience){
    override var salary = 500000.00
    override fun dateOfBirth(date:String) {
        println("Date of Birth is: $date")
    }
}


fun main(args: Array<String>) {
    val eng = Engineer("Tejas",2)
    eng.EmployeesDetails()
    eng.dateOfBirth("02 December 1994")
}