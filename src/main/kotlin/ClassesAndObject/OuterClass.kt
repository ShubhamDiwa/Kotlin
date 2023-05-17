package ClassesAndObject

class OuterClass {
    private var name: String = "Ashu"
    inner class nested{
        var description:String="code inside nested class"
        private var id: Int = 101
        fun foo(){
              println("name is ${name}") // cannot access the outer class member
            println("Id is ${id}")
        }
    }
}

fun main() {
    println(OuterClass().nested().description) // accessing property
    var obj=OuterClass().nested()
    obj.foo()

}