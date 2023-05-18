package OOPS.inheritance

open class Bird {
    fun fly(){
        println("Bird id flying..")
    }
    class Duck:Bird(){
        fun Eating() {
            println("Duck is Eating......")
        }
    }
    
}
fun main() {
    var c=Bird.Duck()
    c.Eating()
    c.fly()
    
}