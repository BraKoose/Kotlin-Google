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
        println("Multifunction : printing")
    }

}


fun main(args : Array<String>){
    val diamond: DiamondProblem = DiamondProblem()
    diamond.koose()
    val example2 : Multifunction = Multifunction()
    example2.print("koose")
    example2.answer()
    example2.call("02999999")
}