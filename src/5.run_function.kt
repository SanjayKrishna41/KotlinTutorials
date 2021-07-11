package com.sanjay.myapplication.KotlinBasics.ScopeFunctions

/**
 * 1. refer to context object by using this
 * 2. return value is the lambda result
 * run is combination of with and let function
 * if we want to operate on a Nullable object and avoid NullPointerException the use RUN
 */
fun main(){

    val person: ScopePerson? = null
    val person1: ScopePerson? = ScopePerson()

    val ageAfterFive = person?.run {
        println(name)
        "age after 5 years ${age+5}" //statement at the end will be returned as result
    }
    println(ageAfterFive)

    val ageAfterFive1 = person1?.run {
        println(name)
        "age after 5 years ${age+5}" //statement at the end will be returned as result
    }
    println(ageAfterFive1)
}