package com.rsk.com.rsk.`100DaysOfGADs`.Day2

fun main (args: Array<String>){
    //Fiiled elements in ArrayList Using Collections
    val arrayList :ArrayList<String> = ArrayList<String>(5)
    val list: MutableList<String> = mutableListOf<String>()

    list.add("sir Charles")
    list.add("Skin")
    list.add("Suleman")
    list.add("Jay")

    arrayList.addAll(list)
    println("........println Arraylist .........")
    val itr = arrayList.iterator()
    while (itr.hasNext()){
        println(itr.next())
    }
    println("Size of the arrayList = " + arrayList.size)
}
