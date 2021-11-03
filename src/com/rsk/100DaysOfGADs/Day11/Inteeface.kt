package com.rsk.com.rsk.`100DaysOfGADs`.Day11

interface MyInteeface {
val id: Int
    fun absMethod(): String
    fun doSomething(){
println("MyInferface is doing some work")
    }
}
class InterfaceImp: MyInteeface{
    override var id: Int = 101
    override fun absMethod(): String {
        return "implementing abstract Method"
    }
}
fun main(args: Array<String>){
    val obj = InterfaceImp()
    println("calling overriding id value = ${obj.id}")
    obj.doSomething()
    println(obj.absMethod())
}