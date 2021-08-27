package com.rsk

class Gideon {
    val drug: String = "Weed"
    var weightLbs: Double = 0.0
    var weightKilos: Double
        get() = weightLbs / 2.2
        set(something){
            weightLbs = something * 2.2
        }
}