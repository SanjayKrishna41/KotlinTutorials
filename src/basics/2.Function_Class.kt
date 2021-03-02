package basics

fun main(args : Array<String>){
    var name="Sanjay Krishna"
    //creating an object of class person and passing name as parameter to display function
    val person = Person(name,20)
    person.display()
    //string interpolation
    println("age of $name is ${person.age}")
}