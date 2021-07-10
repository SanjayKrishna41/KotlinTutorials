package com.sanjay.myapplication.KotlinBasics

//val pi:Float = 3.14f
val pi:Float by lazy{
    3.14f
}

fun main(){
    println("Hello")

    val area = pi*4*4 // initilized for the first time
    val area1 = pi*3*3 // pi value loaded from cache

    println(area)
}