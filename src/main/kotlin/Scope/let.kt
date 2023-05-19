package Scope

fun main() {
    val name:String ?  = "Shubham"

    name?.let {
        println(it.reversed())
        println(it.length)
        println(it.capitalize())
    }



}