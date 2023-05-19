package Scope

fun main() {
    val person=Person1().apply {
        name="raman"
        age=21
    }
    with(person){
        println(name)
        println(age)
    }
}
class Person1 {
    var name:String="  "
    var age:Int=24
}