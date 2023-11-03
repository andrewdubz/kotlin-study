package section2.constructors

class Alien(name: String) {
    val greeting = "Poor $name!"
}

fun main() {
    val alien = Alien("Mr. Meeseek")
    println(alien.greeting)
}

/*

Creating an Alien object requires the argument. Name initialises the greeting property
within the constructor, but it is not accessible outside the constructor.

If you want the constructor parameter to be accessible outside the class body,
define it as a val or a var in the parameter list.
 */