package com.rsk.com.rsk.`100DaysOfGADs`.Day5

class account {
    var acc_no: Int = 0
    var name: String? = ""
    var amount:Float = 0.toFloat()
    fun insert(ac: Int, n:String, am:Float){
        acc_no = ac
        name = n
        amount = am
        println("Accounr no : ${acc_no} holdder : ${name} amount : ${amount}")
    }
        fun deposit(){
            //deposit code
        }
        fun checkBalance(){
            //balance check code
        }
}
fun  main (agrs: Array<String>){
    account()
    var acc = account()
    acc.insert(9090903, "Koose", 100f)
    println("${acc.name}")
}