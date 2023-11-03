package section2.creatingclasses

class Dog {
    fun bark() = "yip!"
}

fun main() {
    val dog = Dog()
    println(dog.bark())
}