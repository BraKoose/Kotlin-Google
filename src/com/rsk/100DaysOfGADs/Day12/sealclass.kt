package com.rsk.com.rsk.`100DaysOfGADs`.Day12

sealed class Shape{
    class Circle(var radius: Float):Shape()
    class Square(var length: Int):Shape()
    class Rectangele(var length: Int, var breadth:Int):Shape()
   // object NotAShape : Shape()
}

fun eval(e: Shape) =
        when (e) {
            is Shape.Circle -> println("Circle area is ${3.1 * e.radius * e.radius}")
            is Shape.Square -> println("Square area is ${e.length * e.length}")
            is Shape.Rectangele -> println("Recetangle is ${e.length * e.breadth}")
        }


fun main (args: Array<String>) {
    var circle = Shape.Circle(0.5f )
    var square = Shape.Square(8)
    var recentagle = Shape.Rectangele(8, 16)
    eval(circle)
    eval(square)
    eval(recentagle)

}