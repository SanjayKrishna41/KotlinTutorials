package collections

import kotlin.system.exitProcess

fun main(args : Array<String>){
    //declaring an array (arrays have fixed size)
    //all array elements default value is zero
    var array = Array<Int>(5){0}

    //updating or initializing value of array
    array[0] = 10
    array[1] = 20
    array[3] = 30

    //displaying array using for-each loop
    for(item in array){
        print(item)
    }

    //displaying indexes
    for(index in 0..array.size-1){
        println(array[index])
    }

}