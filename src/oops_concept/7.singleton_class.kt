package oops_concept

fun main(args:Array<String>){
//    var custom = CustomerData()  cannot create an instance of single-ton class
    CustomerData.count = 100
    CustomerData.typeOfCustomer()
    CustomerData.display("Hello")
}
open class InheritClass{
    open fun display(str:String){
        println("Super class")
    }
}
object CustomerData : InheritClass(){
    //behaves as static variable
    var count:Int = -1
    //behaves as static function
    fun typeOfCustomer():String{
        return "Indian"
    }

    override fun display(str: String) {
        //using super keyword we can call the display method of the super class
        super.display(str)
        println(str)
    }
}