package com.rsk.com.rsk.`100DaysOfGADs`.Day5

class Outerclass {
    private  var name: String = "Koose"
    inner class nestedClass{
var description: String = "Code is inside nested class"
    private var id: Int = 456
    fun foo(){
        //print("name is ${name}")
    println("id is ${id}")
            }
    }
}
fun main(args: Array<String>){
    println(Outerclass().nestedClass().description)
    var obj = Outerclass().nestedClass()
    obj.foo()
}