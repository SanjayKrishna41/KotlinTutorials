package basics

fun main(args:Array<String>){
    var r1 = 1..2   //This range contains the number 1,2,3,4,5
    println(r1)

    var r2 = 5 downTo 1  //This range contains the number 5,4,3,2,1
    println(r2)

    var r3 = 5 downTo 1 step 2 //prints numbers 5,3,1
    println(r3)

    var r4 = 'a' .. 'z'
    println(r4)

    var isPresent = 'c' in r4
    println(isPresent)

    var countDown = 10.downTo(1)
    println(countDown)

    var moveUp = 1.rangeTo(10)
    println(moveUp)
}