package com.rsk.com.rsk.`100DaysOfGADs`.Day30

fun main() {
    val config = NameArguments(
            root= "~/folder",
            term = "StartUp - Netflix",
            recursive = true,
            followSymlinks = true
    )
}

class NameArguments (val root: String, val term: String, recursive: Boolean, val followSymlinks: Boolean)