package section2.constructors

class MutableNameAlient(var name: String)

class FixedNameAlient(val name: String)

fun main() {
    val alien1 = MutableNameAlient("Reverse Giraffe")
    val alien2 = FixedNameAlient("Krombopulos Michael")

    alien1.name = "Parasite"
    // alien2.name = "Parasite"
}

/*
When name is defined as a var or val, it becomes a property and it thus accessible
outside the constructor. val constructor parameters cannot be changed, while var
constructor parameters are mutable.
 */