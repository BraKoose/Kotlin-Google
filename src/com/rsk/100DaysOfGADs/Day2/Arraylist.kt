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
    //set() function of Arraylist is used to retrieve elements present at the given index
    println(".................arrayList.set(2)......")
    println(arrayList.set(0, "Koose"))
    println(".......println Arraylist.....")
    for(i in arrayList){
        println(i)
    }
        println("........arraylist. indexof......")
    println(arrayList.indexOf("Koose"))
}
