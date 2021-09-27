package com.rsk.secondModule

import com.rsk.com.rsk.secondModule.Meeting

fun main(agrs: Array<String>):Unit{
    val inits = listOf(1, 2, 3, 4, 5)

    val smallInts = inits.filter { it < 5 }
    for (i: Int in smallInts) println(i)

    val squaredInts = inits.map{ it*it}

    for(i: Int in squaredInts) println(i)

    val meetings = listOf(Meeting(1, "404 Solutions"), Meeting(2, "Clade Industries"))

    val titles = meetings
            .filter { it -> it.title.startsWith("4") }
            .map { m -> m.title }
    for (t in titles) println(t)
}

class Meeting(val id: Int, val title:String){

}