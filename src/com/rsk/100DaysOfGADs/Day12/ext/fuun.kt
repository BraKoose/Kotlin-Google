package com.rsk.com.rsk.`100DaysOfGADs`.Day12.ext

class Student {
    fun isPassed(mark:Int):Boolean{
        return mark > 40
    }
}
    fun Student.isExcellent(mark: Int):Boolean{
        return mark > 90
    }
    fun main(args: Array<String>){
        val student = Student()
        val passingStatus = student.isPassed(51)
        println("student passing status is $passingStatus")

        val excelllenceStatus = student.isExcellent(99)
        println("persistance is the quality of excellence $excelllenceStatus")
    }