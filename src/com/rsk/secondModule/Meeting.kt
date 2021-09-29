package com.rsk.com.rsk.secondModule


class Meeting(val id: Int, val title:String){
    val people = listOf(Person("Koose"), Person("Mr.Bonney"))
}

data class Person(val name:String){

}