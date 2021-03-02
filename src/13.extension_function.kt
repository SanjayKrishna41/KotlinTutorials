fun main(agrs : Array<String>){
    val std = Student()
    println(std.hasPassed(40))
    println(std.isFirstClass(40))
    println(std.isDist(40))
}

//Extension Functions
fun Student.isFirstClass(marks: Int) : Boolean{
    return marks>60
}

fun Student.isDist(marks: Int) : Boolean{
    return marks>80
}

class Student{
    fun hasPassed(marks:Int) : Boolean{
        return marks>35
    }
}