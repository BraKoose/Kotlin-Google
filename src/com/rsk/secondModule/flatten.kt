package com.rsk.com.rsk.secondModule

fun iter (seq: Sequence<String>){
    for (t in seq) println(t)
}

fun main( agrs: Array<String>): Unit {
    val meetings = listOf(
            Meeting(1, "Koose Meeting"),
            Meeting(2, "Mr Bonney Meetings0o")
    )

    val titles: Sequence<String> = meetings
            .asSequence()
            .filter { println("filter($it)"); it.title.endsWith("g")}
            .map { println("map($it)"); it.title }

    iter(titles)

   // for (t in titles) println(t)

   /* val title = meetings
            .asSequence()
            .map { println("map($it)"); it.title.toUpperCase() }
            .find{it.startsWith("KOOSE")}
**/

   // println(title)

}