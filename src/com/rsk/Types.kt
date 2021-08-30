package com.rsk

interface Time{
    // Creating Interfaces
    //Default implementations.

    fun setTime(hours: Int, mins: Int = 0 , secs: Int = 0)
    fun setTime(time: KooseTime) = setTime(time.hours)
}
interface  EndOfTheWorld{
    fun setTime(time: KooseTime){}

}

class KooseTime{
    var hours: Int = 0
    var minutes:Int= 0
    var seconds: Int = 0
}

class YetTime: Time, EndOfTheWorld{

    override fun setTime(time: KooseTime) {
        super<EndOfTheWorld>.setTime(time)
    }
    override fun setTime(hours: Int, mins: Int , secs: Int){}
}
