package Scope

fun main() {
val person=Person()
    println(person.name)
    println(person.age)

    with(person){
        this.name
        this.age
    }



}
class Person{
    var name:String="Shubham Diwakar "
    var age:Int=24
}