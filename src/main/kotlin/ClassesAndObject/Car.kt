package ClassesAndObject

class Car {
    var brand = ""
    var model = ""
    var year  = ""
}
class Account{
    var acct_no:Int =0
    var name: String = ""
    var amount:Float= 0F


    fun insert(ac:Int,n:String,am:Float) {
        acct_no = ac
        name = n
        amount= am

        println("Account no: ${acct_no} holder :${name} amount :${amount}")

    }



}
fun main() {

    // creating a class
    val c1= Car()
    c1.brand = "BMW"
    c1.model = "A series"
    c1.year = "2017"

    println(c1.brand + " " + c1.model+" "+c1.year)

// creating a multiple object

    val c2= Car()
    c2.brand = "Audi"
    c2.model = "A5"
    c2.year  = "2021"

    println(c2.brand+" "+c2.model+" "+c2.year)

    Account()
    var acc=Account()

    acc.insert(2314,"shubham",1000F)
    println(acc)
}