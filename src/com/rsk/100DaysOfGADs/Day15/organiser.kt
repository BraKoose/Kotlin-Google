package com.rsk.com.rsk.`100DaysOfGADs`.Day15

import com.rsk.Address
import com.rsk.meetingss

fun main(args: Array<String>){
    val m= meetingss()
    m.addtitle("Title")
    m.addtitle("404 Solutions")
    val title: String? = m.meetingTitle()

    println(title)
}

class HomeAddress:Address {
    override fun getFirstAddress(): String {
        return " "
    }
}


class WorkAddress:Address {
    override fun getFirstAddress(): String? {
        return " "
    }
}