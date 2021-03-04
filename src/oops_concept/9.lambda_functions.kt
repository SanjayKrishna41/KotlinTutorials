package oops_concept

fun main(args : Array<String>) {
    val program = Program()
    var result = 0
    program.addNumbers(2, 7, object : test {
        override fun execute(sum: Int) {
            println(sum)
        }
    })
    //lambda function
//    val lambda : (Int,Int) -> Int = {num1:Int,num2:Int-> num1+num2}
//    program.addNumbers(21,27, {num1,num2-> num1+num2})
    program.addNumbers(9,5) {num1,num2-> result = num1+num2}
    println("result = $result")
}

class Program{
    //high level function with lambda as parameter
    fun addNumbers(a :Int,b:Int,action : (Int,Int) -> Unit){
//        println("Sum of $a and $b = ${action(a,b)}")
        action(a,b)
    }
    //using the interface or object oriented way
    fun addNumbers(a :Int,b:Int,action: test){
        val res = a+b
        action.execute(res)
    }
}

interface test{
    fun execute(sum:Int)
}
