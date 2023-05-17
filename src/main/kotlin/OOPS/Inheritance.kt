package OOPS

import visibilityModifiers.public

open class Inheritance  {
    val name ="GeeksForGeeks"
    fun A(){
        println("Base Class ")

    }

}
class DerivedClass:Inheritance(){
    fun B(){
        println(name)           //inherit name property
        println("Derived class")
    }
}

fun main() {
    val der=DerivedClass()
    der.B()
    der.A()
    der.name


}