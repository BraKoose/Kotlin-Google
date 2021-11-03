package com.rsk.com.rsk.`100DaysOfGADs`.Day11

abstract class Bank {
    abstract fun simpleInterest(p: Int, r : Double, t: Int):Double
}

class SBI: Bank(){
    override fun simpleInterest(p: Int, r: Double, t: Int): Double {
        return (p * r * t)/100
    }
}
class PNB : Bank(){
    override fun simpleInterest(p: Int, r: Double, t: Int): Double {
        return (p* r * t) / 100
    }
}

fun main(args: Array<String>){
    var sbi : Bank = SBI()
    val sbiint = sbi.simpleInterest(1000, 5.0, 3)
    println("SBI Interest is $sbiint")
    var pnb: Bank = PNB()
    val pnbint = pnb.simpleInterest(1000, 4.5, 3)
    println("PNB interest is $pnbint")
}