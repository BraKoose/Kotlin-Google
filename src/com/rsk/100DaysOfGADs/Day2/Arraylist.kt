package com.rsk.com.rsk.`100DaysOfGADs`.Day2

fun main (args: Array<String>){
 // initialize Arraylist capacity
    val arrayList = ArrayList<String>(10)
    arrayList.add("Iphone")
    arrayList.add("Samsung")
    arrayList.add("Lampstand")
    arrayList.add("Java")
    arrayList.add("Kotlin")
    println(".....println ArrayList.......")
    for( i in arrayList){
        println(i)
    }
    println("Size of arrayList 1 = " + arrayList.size)
    val  arrayList1 = ArrayList<Int>(5)
    arrayList1.add(10)
    arrayList1.add(90)
    arrayList1.add(101)
    arrayList1.add(15)
    arrayList1.add(2)
    println(".........println ArrayList1 ...")
    for( i  in arrayList1){
        println(i)
    }
    println("size of the arraylist1 = " + arrayList1.size)

}
