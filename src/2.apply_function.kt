package com.sanjay.myapplication.KotlinBasics.ScopeFunctions

// apply - returns context object
fun main(){
    val scopePerson = ScopePerson().apply {
        this.name = "Sanjay Krishna"
        this.age = 31
    }

    println("Name : ${scopePerson.name} and age = ${scopePerson.age}")

    scopePerson.also {
        it.name = "Sanjay Krishna S"
        println("First Name:${it.name}")
    }
}