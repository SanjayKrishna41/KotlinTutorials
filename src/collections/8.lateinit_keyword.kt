package com.sanjay.myapplication.KotlinBasics

fun main(){
    val country = Country()
    country.name = "India"
    println(country.name)

    country.setup()

}

class Country{
    lateinit var name:String

    fun setup(){
        name = "USA"
        println("name of country is : $name")
    }
}