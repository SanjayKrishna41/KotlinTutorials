fun main(args: Array<String>) {
    val str1 = "Hello "
    val str2 = "Kotlin "
    val str3 = "Programmer"

    println(str1.add(str2, str3))

    val x = 10
    val y = 2
    //call to infix function
    val greatest = x greatestOfTwoNumber y
    println("greatest of $x and $y is $greatest")
}

//extension function of class int and infix function because it has single parameter
infix fun Int.greatestOfTwoNumber(num: Int): Int {
    return if (this > num)
        this
    else
        num
}

//extension function of class string
fun String.add(s1: String, s2: String): String {
    return this + s1 + s2
}