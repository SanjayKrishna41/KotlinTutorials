package com.sanjay.myapplication.KotlinBasics.ScopeFunctions

class ScopePerson{
    var name:String = "sanjay"
    var age:Int = 26
}

fun main(){
    val person = ScopePerson()
    println(person.name)

    // with
    val ageAfterFive: String = with(person){
        println(name)
        "age after 5 years ${age+5}"
    }
    println(ageAfterFive)
}
