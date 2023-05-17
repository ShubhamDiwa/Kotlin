package function

import kotlin.math.sqrt

fun main(args: Array<String>) {

  //  println(sum(2,6))

//    val result= mul(2,6)
//    println(result)
//
//    val program1= program()
//    program1.addTwoNumbers(2,7,{x,y->x+y})
//
//    val sum:(a:Int,b:Int) -> Unit = { i,i1->
//        println(i+i1)
//    }
//    sum(2,6)

    val mul:(Int ,Int)-> Int  ={a,b -> a*b}
    val res= function.mul(2,6)
    println(res)

    val div:(a:Int,b:Int)-> Unit={a,b-> println(a/b) }
    div(6,2)


    val sub={a:Int,b:Int->a-b}
    println(sub(6,4))



    val sub2:(Int,Int)->Int={a,b->a-b}
    println(sub2(6,3))



    println()


    val numbers = arrayOf(1,-2,3,-4,5)
        println(numbers.filter { it > 0 })

    println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")

    val number = arrayOf(7,-2,5,-3,8)

        println(number.filter {item -> item > 0 })

println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")

    val find =fun(num: Int): String{
        if(num % 2==0 && num < 0) {
            return "Number is even and negative"
        }
        else if (num %2 ==0 && num >0){
            return "Number is even and positive"
        }
        else if(num %2 !=0 && num < 0){
            return "Number is odd and negative"
        }
        else {
            return "Number is odd and positive"
        }
    }

       // val result = find(115)
        println(find(120))


    println("____________________________________________________________-")

    val ano=fun(a:Int,b:Int): Int=a+b
    println(ano(5,6))







}





//  val sum:(a:Int,b:Int) -> Unit = { i,i1->
//      println(i+i1)
//  }

//val mul:(Int ,Int)-> Int  ={a,b -> a*b}

class program{
    fun addTwoNumbers(a:Int,b:Int,action:(Int,Int)->Int) {
        val result=action(a,b)
        println(result)
    }
}