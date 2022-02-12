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

fun main(args : Array<String>){
    DiamondProblem()
}