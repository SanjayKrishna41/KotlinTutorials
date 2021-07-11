package com.sanjay.myapplication.KotlinBasics.ScopeFunctions


/**
 * 1. refer to context object by using it
 * 2. rerun value is the context object
 */
fun main(){
    val numList: MutableList<Int> = mutableListOf(1,2,3)

    val numbers =numList.also {
        it.add(4)
        println("the list elements : $it")
        it.remove(2)
        println("the list elements : $it")
        it.add(7)
        println("the list elements : $it")
    }

    println("original $numList")
    println("duplicate $numbers")
}