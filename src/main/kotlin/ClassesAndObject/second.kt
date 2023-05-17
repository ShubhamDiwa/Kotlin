package ClassesAndObject

class second {
    constructor(name:String,id:Int){
        println("Name=$name")
        println("Id=$id")
    }

}

fun main() {
    val second=second("Shubham",21)
    println(second)

    val myClass= myClass("Shubham",123,"Shubham23")

}

// Secondary Constructor
class myClass(Password:String){

    constructor(name:String,id:Int,Password: String):this(Password){
        println("name=$name"+ " id=$id " + " " +"password=$Password")
    }

}


