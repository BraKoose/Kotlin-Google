package com.rsk.com.rsk.ISpace100Days

interface A {
    fun koose(){
        println("A: Koose")
    }
}

interface B {
    fun koose(){
        println("B Koko")
    }
}

class DiamondProblem: A, B{
    override fun koose() {
        println("I love Programming")
    }

}

interface Printable {
    fun print(doc:String) = println("Printer:Printing $doc")
}
interface Fax {
    fun call(number: String) = println("Calling $number")
    fun print(doc: String) = println("Fax:Printing $doc")
    fun answer() = println("answering")
}
class Multifunction: Printable, Fax{
    override fun print(doc: String) {
        super<Fax>.print(doc)
        super<Printable>.print(doc)
        val printer: Printable = Multifunction()
        printer.print("L")
        println("Multifunction: printing")
        println("Multifunction : printing")
    }

}

/*Understanding Ploymorphics in Kotlin, its goes hand
with Inheritance
* */

open class shape{
    open fun area(): Double{
        return 0.0
    }
}
open class Circle(val radius: Double): shape(){
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}
open class Square(val side: Double): shape(){
    override fun area(): Double {
        return side * side
    }
}

fun calculateAreas(shapes: Array<shape>){
    for (_shape in shapes ){
        println(_shape.area())
    }
}

open class Person(_name:String) {
    val name = _name
    open fun talk() {
        println("${this.javaClass.simpleName} talking")
    }
}
open  class Employee(_name:String, _empid:String = "1001") : Person(_name) {
    val empid = _empid
    override fun talk() {
        super.talk()
        println("Hello")
    }

    final override fun toString():String {
        return "name: $name | id: $empid"
    }
}

class Programmer(_name:String) : Employee(_name) {
    override fun talk() {
        super.talk()
        println("Programmer overriding talk()")
    }
}

fun main(args : Array<String>) {

    val program: Programmer = Programmer("Ama")
    program.talk()
    program.toString()
    val person: Person = Person("Koose")
    person.talk()
    person.toString()
    val circle: shape = Circle(30.1)
    val square: shape = Square(7.9)
    circle.area()
    square.area()
    }



