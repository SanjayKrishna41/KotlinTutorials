package com.sanjay.myapplication.KotlinBasics

/**
 * Filter - returns a list containing only elements matching the given [predicate].
 */

/**
 * Map - returns  list containing the results of applying the given [transform] function to each
 * element in the original collection.
 */

fun main() {
    val myNumbers: List<Int> = listOf(10, 20, 40, 60, 2, 3, 4, 5, 6, 23, 90)

    //filtering small numbers
    val smallNumbers = myNumbers.filter { num -> num < 20 }
    // OR {it<10}
    //filtering large numbers than 20
    val largeNumbers = myNumbers.filter { it > 20 }
    //print smaller numbers
//    for (num in smallNumbers) {
//        println(num)
//    }
    //print larger numbers
//    for (num in largeNumbers) println(num)
    println("=============================")
    // to get square of numbers
    val squareNumbers = myNumbers.map { it * it } // OR {num->num*num}

//    for (num in squareNumbers) println(num)

    val filterAndMap = myNumbers
        .filter { it > 20 }
        .map { it+it }
    for (num in filterAndMap) println(num)

    var people:List<Person> = listOf(Person(10,"sanjay"),Person(11,"krishna"),Person(12,"sree"))
    // print all there sames
    var names = people.map { it.name }
    for (name in names) println(name)
    // print age of all the persons with name starting with s
    var custom = people
        .filter { it.name.startsWith("s") }
        .map { "${it.name},${it.age}" }
    for (name in custom) println(name)
}

class Person(var age:Int,var name:String){

}