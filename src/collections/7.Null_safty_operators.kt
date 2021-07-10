package com.sanjay.myapplication.KotlinBasics

fun main() {
    // find length of name
//    val name: String? = null
    var name: String? = null
    name = "Sanjay"
    // 1. Safe call (?.)
    // Returns the length if name is not null else returns null
    // use it if you don't mind getting null value
    println("length is ${name?.length}")

    // 2. safe call with let (?.let)
    // it executes the block ONLY IF name is not null
    name?.let { println("length is ${name?.length}") }

    // 3. Elvis (?:)
    // When we have nullable reference, we can chose to print variable is null or any other value
    // normal way
//    val length = if(name!=null)
//        name.length
//    else
//        -1

    // using Elvis operator (if name.length is null return -1)
    val len = name?.length ?: -1
    println(len)

    // 4. Non-null assertion (!!)
    // use it when you are sure the value is not null
    // Throws null pointer exception if the value is found to be null
    println("length ${name!!.length}")
}