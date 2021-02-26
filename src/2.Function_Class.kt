fun main(args : Array<String>){
    var name = "Sanjay";

    //creating an object of class person and passing name as parameter to display function
    var person = Person()
    person.display(name)
    //string interpolation
    println("age of $name is ${person.age}")
}

//creating a class and a display function
class Person{
    val age = 10;
    fun display(name: String){
        println(name)
    }
}