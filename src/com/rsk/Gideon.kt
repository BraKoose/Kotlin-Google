package com.rsk

class Gideon(drug: String, weightLbs:Double) {
    val drug = drug
    var weightLbs = weightLbs
    var weightKilos: Double
        get() = weightLbs / 2.2
        set(something){
            weightLbs = something * 2.2
        }
}