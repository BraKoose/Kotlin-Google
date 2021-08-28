package com.rsk

class Gideon(val drug: String, var weightLbs:Double) {
    //using primary contructors so i dont need to declare those properties variables.

    var weightKilos: Double
        get() = weightLbs / 2.2
        set(something){
            weightLbs = something * 2.2
        }
}