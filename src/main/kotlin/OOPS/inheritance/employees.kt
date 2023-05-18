package OOPS.inheritance

class employees(name:String,Salary:Float) {
    init {
        println("name is $name ")
        print("Salary is $Salary")
    }
}
class Programmer(name: String,age:Int,Salary: Float):Employee(name,age,Salary){
    init {
        println("name$name  ,age is $age,Salary is $Salary")
    }
    fun coding() {
        println("Coding is Passion ")
    }
}
class Android(name: String,age: Int,Salary: Float):Employee(name,age,Salary){
    init {
        println("name is $name, age is $age ,Salary is $Salary")
    }
    fun developer() {
        println("Development is Something i do!!")
    }
}

fun main() {
 val c=Programmer("Shubham",24,25000F)
    c.coding()


    println()

    val d=Android("Abhisekh",21,22000F)
    d.developer()
}