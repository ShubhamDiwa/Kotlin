package Scope

fun main() {
    val person:Person?=null
    val bio=person?.run {
        println(name)
        println(age)
        age+5
        "hello world "

    }
    println(bio)
}