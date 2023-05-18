package Ranges

class ranges {
}

fun main() {
    for (a in 1..5){
        print(a )
    }
    println()
    for(x in 'a'..'f'){
        print(x )
    }
    println()
    val range = 1.0..5.0
    println(range)
    println("3.14 in range is ${3.14 in range}")

    println("___________________________________________________________________________________________________________")

    for (a in 5 downTo 1){
        print(a )// 54321
    }

    println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")


    for (a in 1 until 5){
        print(a ) // print 1234
    }


println("_____________________________________________________________________________________----------")

    for (x in 1..10 step 2)
        print("$x ")
    println()



}