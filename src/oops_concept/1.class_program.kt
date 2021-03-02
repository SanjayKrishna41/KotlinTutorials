package oops_concept

fun main(args : Array<String>){

    val student = Student("sanjay")
}

//class with primary constructor
class Student (var name:String){
    //init block (get executed after instance(after object creation) of class is created)
    init {
        println("My name is $name")
    }
}