package ClassesAndObject

open class SuperClass {
    constructor(name: String, id: Int, pass: String = "KABIR") {
        println("2")
        println("Name = ${name}")
        println("Id = ${id}")
        println("Password = ${pass}")
    }
}

class ChildClass : SuperClass {
    constructor(name: String, id: Int, pass: String) : super(name, id) {
        println("1")
        println("Name = ${name}")
        println("Id = ${id}")
        println("Password = ${pass}")
    }

    constructor(name: String, id: Int) : this(name, id, "POS") {
        println("3")
        println("Name = ${name}")
        println("Id = ${id}")
    }
}

fun main(args: Array<String>) {
    val obj2 = ChildClass("Ashu", 101)
}