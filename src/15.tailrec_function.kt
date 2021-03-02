import java.math.BigInteger

fun main(args:Array<String>){
    println(fiboRecursive(90, BigInteger("1"),BigInteger("0")))
}
//fibo function using tail rec
tailrec fun fiboRecursive(n:Int,a:BigInteger,b:BigInteger):BigInteger{
    if (n==0)
        return b
    else
        return fiboRecursive(n-1,b,a+b)
}
