import com.rsk.Person

fun main(args: Array<String>){
    println("Hello Koose")

    var Koose = Person("Koose", 12)

        println("Name is ${Koose.name} ")
        println("and your age is ${Koose.age}")
    Koose.name= "Kwesi"
    println("This is your best pal ${Koose.name}")
    Koose.display()
    Koose.displayWithLambda(:: printname)
}
fun printname(name: String){
    println(name)
}