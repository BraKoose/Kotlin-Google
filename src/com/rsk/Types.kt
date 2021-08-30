package com.rsk

interface Time{
    // Creating Interfaces

    fun setTime(hours: Int, mins: Int = 0 , secs: Int = 0)
    fun setTime(time: KooseTime) = setTime(time.hours)
}

class KooseTime{
    var hours: Int = 0
    var minutes:Int= 0
    var seconds: Int = 0
}

class YetTime: Time{
    override fun setTime(hours: Int, mins: Int , secs: Int){}
}
