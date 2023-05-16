package controlflow

fun main() {
    // if else
    var a=50
    var b=60

    if (a>b){
        println(" A is gfrester than B:")
    }
    else{
        println(" B is greater thn A ")
    }
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    val num1 = 10
    val num2 =20
    val result = if (num1 > num2) {
        "$num1 is greater than $num2"
    } else {
        "$num1 is smaller than $num2"
    }
    println(result)


    val numA= 10
    val numB =20
    val resultR = if (numA > numB) "$numA is greater than $numB" else "$numA is smaller than $numB"
    println(resultR)
}