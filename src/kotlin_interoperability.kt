//main function
fun main(arg:Array<String>){
    val res = java_interoperability.max(4,5);
    println("printing result of max function in kotlin code - $res");

    var res1 = findVolume(2,3)
    println(res1)
    var res2 = findVolume(2)
    println(res2)
}
//function to add two numbers
fun addNumber(a:Int,b:Int) : Int{
    return a+b
}

//function to return volume of cube (with height as default parameter)
@JvmOverloads
fun findVolume(length:Int,breadth:Int = 5,height:Int = 5) : Int {
    return length * breadth * height
}