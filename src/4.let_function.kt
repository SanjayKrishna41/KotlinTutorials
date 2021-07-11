package com.sanjay.myapplication.KotlinBasics.ScopeFunctions

/**
 * 1. refer to context object by using it
 * 2. return value is lambda result
 */
fun main(){
    // use let function to avoid NullPointerException
    val name:String?=null

    val len = name?.let {
        println(it.reversed())
        println(it.capitalize())
        it.length
    }

    println(len)
}