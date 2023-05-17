package ClassesAndObject

open class mySec {

    constructor(name: String, id: Int) {
        println("SECOND")
        println("Name = ${name}")
        println("Id = ${id}")
    }

    constructor(name: String, id: Int, pass: String) : this(name, id, pass = "Melody", "BLOOD") {
        println("FIRST")
        println("Name = ${name}")
        println("Id = ${id}")
        println("Password = ${pass}")
    }

    constructor(name: String, id: Int, pass: String, temp: String) : this(name, id) {
        println("THIRD")
        println("Name = ${name}")
        println("Id = ${id}")
        println("Password = ${pass}")
        println("temp = ${temp}")
    }
}

fun main() {
    val myclass2 = mySec("DEV", 101, "DELL", "HP")

    //val myclass = mySec ("SHUB", 101,"pass")
}