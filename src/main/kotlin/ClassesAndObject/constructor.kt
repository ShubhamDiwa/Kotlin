package ClassesAndObject

class constructor (var name:String, var id: Int) {


// primary constructor

    init {
        name=name.capitalize()

    }
}



fun main(args:Array<String>) {

    val myclass = constructor ("ashu", 101)

    println("Name = ${ myclass.name}")
    println("Id = ${ myclass.id}")

}