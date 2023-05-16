package Operator

fun main() {
// Arithimatic Operator
    var a=5
    var b=10

    println(a+b)
    println(b-a)
    println(a*b)
    println(a/b)
    println(a%b)

// Relationational Operator
    val a1 = 5
    val b1 = 10

    if (a1>b1){
        println("A is greater than b")
        a1
    }else{
        println("B is greater than a ")
        b
    }

//Assignment Operator

    var C =20
    var D=5
    C+=D
    println(C)// here the value of C is 25

    C-=D
    println(C)// the value of C here is 20

    C*=D
    println(C) // so here 20*5=100

    C/=D
    println(C) // 100/5== 20


    // Unary Operator

    var E=20
    var F=5

    var flag =true

    println("+a:"+E)
    println("+b:"+F)
    println("+A " + ++E)// here value of E is 21
    println("--b :"+ --E) // after -- the value becomes 20
    println("!flag :"+ !flag)

    //Logicl-Operator
    // logical and logical or

    var A=10
    var B=5
    var c=15
    var result: Boolean
    result = (A>B) && (A>B)
    println("(A>B) && (A>c) :"+ result)
    result = (a>b) || (a>c)
    println("(A>B) || (A>c) :"+ result)
    result = !flag
    println("!flag :"+ result)






}

