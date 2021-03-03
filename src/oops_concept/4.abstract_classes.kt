package oops_concept

fun main(args : Array<String>){

//    var person = Person() //cannot create an instance of abstract class
    val indian = Indian()
    indian.displayAge()
}

//abstract class - cannot create instance of abstract class
abstract class Person{

    abstract val age:Int        //Abstract variable open by default

    fun displayName(){}         // A Normal function public and final by default
    open fun displaySSID() {}   //An Open function ready to be overridden
    abstract fun displayAge()   //Abstract functions are open by default and must be overridden
}

class Indian : Person(){
    override val age: Int = 25

    override fun displayAge() {
        println("Age = $age")
    }

}