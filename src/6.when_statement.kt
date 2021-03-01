fun main(args : Array<String>){
    var x =10
    //normal when statement
    when(x){
        in 1..2 -> println("X value is 1")
        2-> println("X value is 2")
        else -> println("X is unknown")
    }
    x =1
    //when as an expression
    val str:String = when(x){
        1-> "x is 1"
        2-> "x is 2"
        else -> "X is unknown , X is unwanted"
    }

    println(str)
}