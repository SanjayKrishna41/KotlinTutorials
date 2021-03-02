package oops_concept

fun main(args: Array<String>) {
    var apple = Apple("Black","3000mAH")
}
//Super class
open class SmartPhone {
    var color: String =""
    init {
//        println("From SmartPhone : $color")
    }
    constructor(color: String) {
        this.color = color
        println("From SmartPhone : $color")
    }
}
//Derived class
class Apple: SmartPhone {

    var battery: String = ""
    init {
//        println("From Apple : $color and $battery")
    }
    constructor(color: String,battery:String) : super(color){
        this.battery = battery
        println("From Apple : $color and $battery")
    }
}

