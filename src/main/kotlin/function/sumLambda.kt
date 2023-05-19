package function

fun main(args:Array<String>) {
    val result = sum1(5,6)
    println(result)

    val res= sum2(5,5)
    println(res)

    println(numbers.filter { item  -> item > 0 })
}

val sum1 = {a:Int ,b:Int ->a+b}
val sum2:(Int ,Int)->Int={a,b -> a+b}

val numbers=  arrayOf(1,-2,6,-8,7,10,5)
