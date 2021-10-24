package com.rsk.com.rsk.`100DaysOfGADs`.Day3

fun main(args: Array<String>){
    val intMap: HashMap<Int, String> = hashMapOf<Int, String>(1 to "Koose", 2 to "Google Scholarship", 3 to "Self Made")
    val StringMap: HashMap<String, String> = hashMapOf<String, String>("name" to "Godfred Addai Amoako")
    StringMap.put("City", "Kumasi")
    StringMap.put("Job", "Software Engineer")
    StringMap.put("Specialized", "Android Developer")
    StringMap.put("Hobbies", "Chess")
    val anyMap: HashMap<Any, Any> = hashMapOf<Any, Any>(1 to "Dreams", "client" to "Nickolas", 8 to "Keep Trying"
    )

    println(".......traverse stringMap......")
    for(key in StringMap.keys){
        println(StringMap[key])
    }

    println(".......traverse intMap......")
    for(key in intMap.keys){
        println(intMap[key])
    }

    println(".......traverse AnyMap......")
    for(key in anyMap.keys){
        println(anyMap[key])
    }
}