package OOPS.inheritance

open class Employee(name: String, age: Int, Salary:Float) {
    init {
        println("name:=$name")
        println("age:=$age")
        println("salary:=$Salary")
    }

}
class programmer(name: String,age: Int,Salary: Float):Employee(name,age,Salary){
    fun coding(){
        println("Coding is fun ")
    }
}
class Sweeper(name: String,age: Int,Salary: Float):Employee(name, age, Salary){
    fun cleans(){
        println("I 'll clean the dirts")
    }
}

fun main() {
    val C=Sweeper("Shubham",24,20000F)
    C.cleans()


    val D=programmer("Abhisekh",21,2000F)
    D.coding()

}
