package com.rsk.com.rsk.ISpace100Days

internal open class Foo {
    internal fun boo() = println("boo")
    internal fun doo() = println("doo")
}
internal fun Foo.bar() {
    boo()
    doo()
}

//Obj declare

object Util {
    var name = ""
        set(value) {
            field = value
        }
    init {
        println("Initializing Util")
    }
    fun foo() = println(name)
}

//Higher Order Functions
//Simpler way with a normal function and :: for reference

fun doThis() {
    println ("action")
}


fun executor(action: () -> Unit){
    action()
    action.invoke()
}

fun trotrofare(fare:(price:Int,AmountPaid:Int) -> Unit) {
    fare(3, 5)
}



fun main(args: Array<String>) {
    var fu = Foo()
    fu.bar()
    trotrofare({price, AmountPaid -> println(AmountPaid -price)  })
    Util.name = "Bar"
    Util.foo() // prints "Bar"
    executor(::doThis)
}
