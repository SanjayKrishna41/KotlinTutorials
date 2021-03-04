package oops_concept

fun main(args : Array<String>){

    println(DemoClass.getDemoId())
}

class DemoClass{
    //when compiled these are converted into static field
    companion object{
        var id :Int = 10

        @JvmStatic
        fun getDemoId():Int{
            return id
        }
    }
}