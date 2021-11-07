package com.rsk.com.rsk.`100DaysOfGADs`.Day15

fun main (agrs: Array<String>){
    var people:MutableList<Person?>? = null
    people = mutableListOf(Person(20), Person(100), Person(72), Person(87))
    people.add(null)

    for (perosn: Person in people.filterNotNull()){
        println(perosn.age)
    }
}

class Person(val age:Int){}
