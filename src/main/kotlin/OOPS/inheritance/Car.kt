package OOPS.inheritance

open class Car {
  open   var color = " Black"
    open fun runs() {
        println("Car  is running ...")
    }

}
interface Mustang{
    fun runs(){
        println("Mustang is running ")

    }
}

class A5():Car(), Mustang {
    override fun runs() {
        super<Car>.runs()
        super<Mustang>.runs()

    }
}

fun main() {
    val f=A5()
    f.runs()

    println(f.color)
}