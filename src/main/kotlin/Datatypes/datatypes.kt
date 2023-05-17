package Datatypes

fun main() {
/*
//    val  myNum=5
//    val myDouble=15.223
//    val Boolean=true
//    val Float=3.125

//    println(myNum)
//    println(myDouble)
//    println(Boolean)
//    println(Float)


    val myNum: Byte = 100// byte
    println(myNum)


    val myNum1: Short = 5000
    println(myNum1)// short is geater than byte

    val myNum2: Int = 100000
    println(myNum2)// Integer s

    val myNum3: Long = 15000000000L// long store more values than Int nd it always end with L
    println(myNum3)



    val myNum4: Float = 5.75F// Float store values in Decimal
    println(myNum4)


    val myNum5: Double = 19.99
    println(myNum5)// double can store values more than Float Data Types


    val myGrade: Char = 'B'
    println(myGrade)// character store single values of character
*/

    var items1 = arrayListOf<String>("shubham","Deep","Amit")
    val items2 = arrayListOf<String>("shubham","Abhisekh ")
    items1 = items2// address of arrays are equal not the values
    //items1 = arrayListOf()
   items1.removeAt(0)
    for(i in items2)
        println(i)

    /*items.add("Dev")
    items.removeAt(0)
    for ( i in items )
        println(i)*/


   // for(i in 1..100)

        for (x in 2..10 step 2)

           println(x)

}