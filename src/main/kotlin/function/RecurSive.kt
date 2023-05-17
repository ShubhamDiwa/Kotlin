package function

fun main(args:Array<String>) {

  var result= Fact(5)
    println(Fact(5))
    println(result)
}

fun Fact(num:Int):Long {
   // return num* Fact(num-1)

    return if (num == 1) num.toLong() // terminate condition
    else num* Fact(num - 1)
}

fun sum(args
        : Array<Int>, index
        : Int)
        : Int
{
    return if (index <= 0) 0 else(
            sum(args, index - 1)
                    + args[index - 1]) // recursive function call
}

