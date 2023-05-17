package visibilityModifiers

class public {
    // by default public
    class A {
        var int = 10
    }

    // specified with public modifier
}
 class B {
    var int2 = 20
    fun display() {
        println("Accessible everywhere")
    }
}

fun main() {
    B()
    var c=B().int2
    var d= B().display()
    println(d)

    println(c)
}
