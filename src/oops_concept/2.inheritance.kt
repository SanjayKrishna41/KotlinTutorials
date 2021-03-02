package oops_concept

fun main(args: Array<String>) {
    val dog = Dog()
    val cat = Cat()
    dog.eat()
    cat.sleep()
    println(dog.className)
    println(cat.className)
}

open class Animal() {

    open var className: String=""

    //using open keyword, this function can be overridden
    open fun eat() {
        println("Animal eating")
    }
    open fun sleep() {
        println("Animal sleep")
    }
}

class Dog : Animal() {
    var breed: String = ""
    override var className:String = "Dog"
    fun bark() {
        println("bark")
    }
    //function overriding
    override fun eat() {
        //calls the parent eat() method
        super<Animal>.eat()
        println("Dog is eating")
    }
}

class Cat : Animal() {
    override var className:String = "Cat"
    var age: Int = -1
    fun mew() {
        println("mew")
    }
    //function overriding
    override fun eat() {
        println("Cat is eating")
    }
    //function overriding
    override fun sleep() {
        println("Cat is Sleeping")
    }
}