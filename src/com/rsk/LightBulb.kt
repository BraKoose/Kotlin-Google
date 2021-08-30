package com.rsk

sealed class PersonEvent {
    class Awake (var awake: String): PersonEvent()
    class Asleep(var time: Time): PersonEvent()
    class Eating (val food: String) : PersonEvent()
}

fun handlePersonEvent(event: PersonEvent){
    when (event){
        is PersonEvent.Awake -> println(event.awake)
        is PersonEvent.Eating -> println(event.food)
        is PersonEvent.Asleep -> println(event.time)
    }
}
