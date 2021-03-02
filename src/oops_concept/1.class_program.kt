package oops_concept

fun main(args : Array<String>){

    Student("sanjay")
    //call to secondary constructor
    Student("krishna",10)
}

//class with primary constructor
class Student (private var name:String){
    var age = 0

    //init block (get executed after instance(after object creation) of class is created)
    init {
        println("Primary Constructor    : My name is ${this.name}")
    }
    //secondary constructor
    constructor(name:String,age:Int):this(name){
        //the body of secondary constructor is called after the init block
        this.age = age
        println("Secondary Constructor  : Age of $name is $age")
    }
}