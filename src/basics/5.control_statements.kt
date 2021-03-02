package basics

fun main(arg : Array<String>){
    val a = 10
    val b = 19

    if(a>b)
        println(a)
    else
        println(b)

    //IF as Expression
    val maxValue:Int = if(a>b) {
                        println("a is grater")
                            a
                        }
                        else{
                        println("b is grater")
                            b
                        }
    println(maxValue)
}