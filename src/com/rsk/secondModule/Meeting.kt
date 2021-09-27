package com.rsk.com.rsk.secondModule

import java.util.*

class Meeting {
    var title: String = ""
    var When: Date = Date()
    var who = mutableListOf<String>()

    fun create(){}
}

fun main (args: Array<String>){
    val m = Meeting()
    m.title = "Board Meeting with Clade Industries"
    m.When = Date(2021,9,27)
    m.who.add("Koose")

    with(m){
        title = "404 Meeting"
        When = Date(2020, 6, 15)
        who.add("Bilson")
    }
    m.apply {
        title = "Koose Meeting"
        When = Date(1990, 1,1)
        who.add("Blullet")
    }.create()
}