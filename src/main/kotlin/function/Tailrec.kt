package function

import java.math.BigInteger

fun main(args:Array<String>) {
 var num=1000.toLong()
    var r= recusiveSum(num)
    println(r)

println(getFibonacci(5,1,0))
}
tailrec fun recusiveSum(n:Long,semiresult:Long=0):Long {
    return  if (n<=0){
        semiresult
    }else{
        recusiveSum((n-1),n+semiresult)
    }
}

tailrec fun getFibonacci(n:Int, a: Int, b: Int): Any {
    return if (n==0)
            return a
         else getFibonacci(n-1,a+b,a)
}

