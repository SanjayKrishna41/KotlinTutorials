package com.sanjay.myapplication.KotlinBasics

fun main(){
    val myNumber = listOf(2,3,4,5,6,23,90)

    //using function (lambda) as variable
    val condition = {num:Int -> num > 10}

    // all - are all the elements greater than 10? returns true or falls
    val check1 = myNumber.all (condition)
    println(check1)

    // any - does any of these elements satisfy the condition
    val check2 = myNumber.any(condition)
    println(check2)

    //count - returns the number of elements that satisfy the condition
    val count = myNumber.count(condition)
    println(count)

    // find - returns the first number that matches the condition
    val num = myNumber.find (condition)
    println(num)
}