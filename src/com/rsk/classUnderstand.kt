package com.rsk
import

class InitOrderDemo(name: String){
    val firsthobby = "Reading : $name".also(::println)

    init {
        println("Second habit that prints $name")
    }

    val thirdMe = "Third Me : ${name}".also (::println)

    init {
        println("Third Me prints all habits ${name.length}")
    }

}

class FilledRectange:Rectangle(){
    override fun draw() {
        val  filler = Filler()
        filler.drawAndFill()
    }

    inner class Filler{
        fun fill(){ println("Filling")}
        fun drawAndFill(){
            super.draw()
            fill()
            println("Drawn a rectangle dream with color ${super@FilledRectangle.borderColor}")
        }
    }
}