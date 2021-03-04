package oops_concept

fun main(args: Array<String>){

    val demo = Demo()
    //conventional method of calling high level functions
    demo.reverse("sanjay") { s -> s.reversed() }
    //use it keyword if passing single parameter in lambda function
    demo.reverse("sanjay") { it.reversed() }
}

class Demo{
    fun reverse(str:String,action:(String)->String){
        println(action(str))
    }
}