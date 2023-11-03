package section2.properties

val constant = 42

var counter = 0

fun inc() {
    counter++
}

/*
Defining a top-level val is safe because it cannot be modified. However, defining
a mutable (var) top-level property is considered an anti-pattern. As your programme
becomes more complicated it becomes harder to reason correctly about
shared mutable state. It's best to guard mutable state with a class.
 */