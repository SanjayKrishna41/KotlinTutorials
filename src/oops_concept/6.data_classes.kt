package oops_concept

fun main(arg:Array<String>){
    val user1 = User(10,"sanjay")
    val user2 = User(10,"sanjay")

    //comparing the object reference
    if(user1 == user2){
        println("Equal")
    }
    else{
        println("Not Equal")
    }
    //prints out the values of the user1 object(if class is declared as data class)
    println(user1.toString())
    //we can copy data from one object to another object
    val user3= user1.copy(name = "Krishna",id = 24)
    println(user3)

}

//purpose of data class is to deal with values not objects
//data classes - primary constructors should contain var or val declared variables
data class User(var id:Int,var name:String){

}