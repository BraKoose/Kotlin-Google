package com.rsk.com.rsk.`100DaysOfGADs`.Day2

fun main (args: Array<String>){
/*
Different Functions of Mutablelist Interface

*/
  var mutableList = mutableListOf<String>()
  mutableList.add("Jersey")
  mutableList.add("Anita")
  mutableList.add("Kingsford")

  var mutableList2 = mutableListOf<String>("Love", "Hate")
  var mutableList3 = mutableListOf<String>("R2bess", "Wahali")
  var mutableList4 = mutableListOf<String>("Omar Sterling", "Life")

  println(".........mutableList.........")
  for(elements in mutableList){
      println(elements)
  }
    println("......mutableList[2]....... ")
    println(mutableList[2])
    mutableList.add(2, "Soldier")
    println(".............mutable.add(2, /soldeir.....")
    for(elements in mutableList){
        println(elements)
    }
    mutableList.add("No Envy")
    println("............mutable.add....no nevy ")
    for(element in mutableList){
        println(element)
    }
    mutableList.addAll(1, mutableList3)
    println("..........mutable.add[mutable3]")
    for(elem in mutableList){
        println(elem)
    }
    mutableList.remove("No Envy")
    println(".....mutablelist.remove No Envy........")
    for(elements in mutableList){
        println(elements)
    }
    mutableList.removeAll(mutableList2)
    println(".........mutablelist.remove mutablelist 2......")
    for(delete in mutableList){
        println(delete)
    }
    println("..........mutablelist.set2....Asko")
    mutableList.set(2, "ASko")
    for(asko in mutableList){
        println(asko)
    }

    println(".....mutablelist.retainall mutable4 .....")
    mutableList.retainAll(mutableList4)
    for(restain in mutableList){
        println(restain)
    }
    println("......mutablelist2 after mutable2.clear ....")
    println(mutableList2)

    println("..........mutableSublist......")



}