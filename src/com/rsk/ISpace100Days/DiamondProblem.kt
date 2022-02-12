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


open class Person(_name:String) {
    val name = _name
    open fun talk() {
        println("${this.javaClass.simpleName} talking")
    }
}
class Employee(_name:String, _empid:String = "1001") : Person(_name) {
    val empid = _empid
    override fun talk() {
        super.talk()
        println("Hello")
    }

    override fun toString(): String {
        return "name: $name | id: $empid"
    }
}

fun main(args : Array<String>){

    val person: Person = Person("Koose")
    person.talk()
    person.toString()
}