package com.rsk.com.rsk.`100DaysOfGADs`.Day6

open class Employees(name: String, age:Int, salary: Float){
    init {
        println("Name is $name.")
        println("Age is $age")
        println("Salary is $salary")
    }
}
class Programmer (name: String, age: Int, salary: Float){
    fun doProgram(){
        println("Programming is my passion and hobby")
    }
}

class Salesman (name: String, age: Int, salary: Float) {
    fun fieldWork() {
        println("travelling is my hobby ")
    }
}

fun main(args: Array<String>){
    val obj1 = Programmer("Koose", 20, 199.000f)
    obj1.doProgram()
    val obj2 = Salesman("Koko", 25, 139.0f)
    obj2.fieldWork()
}