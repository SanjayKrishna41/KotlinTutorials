package basics

//basics.main function
fun main(arg:Array<String>){
    println(addNumbers(1,2))
    val res = max(3,4)
    println("$res is greater")
}
//function to basics.add two numbers
fun addNumbers(a:Int,b:Int) : String{
    return "Sum of $a + $b = ${a+b}"
}

//one-line function - function as expression
fun max(a:Int, b: Int) : Int = if(a>b) {a} else {b}
