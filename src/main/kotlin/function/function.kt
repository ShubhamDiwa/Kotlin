package function

fun main() {
    // standard library function

    var sum= arrayOf(1,2,3,4,6,8,9,2).sum()
    println("the sum of arrays are :"+sum)

    var num1= 30
    var num2=7

    var result=num1.rem(num2)
    println(result)


    // user defined function



}

fun main(args:Array<String>) {
    sum()

    println(Student("Shubham ",'A',22))
}
fun sum() {
    var num1=2
    var num2=4
    println("Sum is equals to :"+ ( num1+num2))

   var result = add(5,6)
    println(result)

    println(mul(5,6))

    val name = "Praveen"
    val rollno = 25
    val grade = 'A'
    Student(name,grade,rollno)
    Student("Gaurav",'B',30)

}

fun add(number1:Int,number2: Int) :Int  {
    val add=number1+number2
    return add

}

fun mul(num1:Int , num2:Int):Int {
    val res=num1*num2
    return res
}

fun Student(name:String,grade:Char,rollno:Int) {
    println("Name of the student:$name")
    println("Name of the student:$grade")
    println("Name of the student:$rollno")


}