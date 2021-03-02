package oops_concept

fun main(args: Array<String>) {
    val dog = Dog()
    val cat = Cat()
    dog.eat()
    cat.sleep()
}

open class Animal(var className: String) {
    init {
        this.className = className
    }

    fun eat() {
        println("${className} eat")
    }

    fun sleep() {
        println("${className} sleep")
    }
}

class Dog : Animal("Dog"){

    var breed: String = ""

    fun bark() {
        println("bark")
    }
}

class Cat : Animal("Cat") {
    var age: Int = -1

    fun mew() {
        println("mew")
    }
}