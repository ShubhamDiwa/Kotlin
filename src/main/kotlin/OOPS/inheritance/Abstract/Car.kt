package OOPS.inheritance.Abstract

 abstract class Car {
     abstract fun run()

 }

open class Car1 {
    open fun run1() {
        println("Car is running fast")
    }

}
class Honda:Car(){
    override fun run() {
        println("Honda is running Safely ")
    }
}

class honda:Car1(){
    
}

fun main() {
    var v =Honda()
    v.run()
}