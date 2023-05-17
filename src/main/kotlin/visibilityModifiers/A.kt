package visibilityModifiers

 private class A {
     private val int=20

     fun display() {
         // we can access int in the same class
         println(int)
         println("Accessing int successful")
     }
 }

fun main() {
    var s=A()
    s.display()

}
