package oops_concept

fun main(args : Array<String>) {
    val program = Program()
    program.addNumbers(2, 7, object : test {
        override fun execute(sum: Int) {
            println(sum)
        }
    })

    val lambda : (Int) -> Unit = {s:Int-> println(s)}     //lambda function
    program.addNumbers(21,7,lambda)
}

class Program{
    //high level function with lambda as parameter
    fun addNumbers(a :Int,b:Int,action : (Int) -> Unit){
         val res = a+b
        action(res)
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
