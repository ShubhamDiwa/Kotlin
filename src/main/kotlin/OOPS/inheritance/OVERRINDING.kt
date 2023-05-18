package OOPS.inheritance


open class bird  {
    open var color ="Black"
    open fun fly() {
        println("Bird is Flying......")
    }


}
class parrot:bird(){

    override var color="Green"
    override fun fly() {
        super.fly()
        println("Parrot is flying ...")
    }
}
class Duck:bird(){
    override var color="White"
   override fun fly() {
       super.fly()
       println("Duck is Ducking..")
   }
}

fun main() {
  /*  val c= parrot()
    c.fly()

    println()

    val d=Duck()
    d.fly()*/

    val p = Duck()
    p.fly()
    println(p.color)

    val q=parrot()
    q.fly()
    println(q.color)
}
