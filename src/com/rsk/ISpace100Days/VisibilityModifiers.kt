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

val doThis:() -> Unit = {
    println("action")
}

fun executor(action: () -> Unit){
    action()
    action.invoke()
}


fun main(args: Array<String>) {
    var fu = Foo()
    fu.bar()

    Util.name = "Bar"
    Util.foo() // prints "Bar"
    executor(doThis)
}
