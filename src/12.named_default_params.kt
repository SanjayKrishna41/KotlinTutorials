//main function
fun main(arg:Array<String>){
    //normal function call
    findVolumeOfCube(1,2,3)
    //named parameter function call
    findVolumeOfCube(breadth = 5,length = 10,height = 15)
}


//function to return volume of cube (with height as default parameter)
fun findVolumeOfCube(length:Int,breadth:Int = 5,height:Int = 5) {
   println("length is $length")
   println("breadth is $breadth")
   println("height is $height")
}