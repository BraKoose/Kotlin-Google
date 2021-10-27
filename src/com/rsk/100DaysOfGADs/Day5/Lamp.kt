package com.rsk.com.rsk.`100DaysOfGADs`.Day5

class lamp {
    //property (data member
    private  var isOn: Boolean = false

    //member function
    fun turnOn() {
        isOn = true
    }
    fun turnOff(){
        isOn = false
    }
    fun displayLightStatus(){
        if (isOn != true)
            println(" lamp is on")
        else
            println(" lamp is off")
    }
}
fun main(args: Array<String>){
   val lamp = lamp()
    lamp.displayLightStatus()


}