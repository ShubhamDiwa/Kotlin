package controlflow

fun main() {

    val marks = arrayOf(80, 85, 60, 90, 70)
    for (item in marks) {
        println(item)
    }

    println("++++++++++++++++++++++++++++++++++++for ()i in range 5..1  print(i)+++++++++++++++++++++++++++++++++++++++++++++++")

    val  draks= arrayOf(10,20,40,30,50)
    for (item in draks.indices)
        println("draks[$item]:"+draks[item])

//
//    println("for ()i in range 1..5  print(i)")
//    for (i in 1..5)
//        println(i)


    println("++++++++++++++++++++++++++++++++++++for ()i in range 5..1  print(i)+++++++++++++++++++++++++++++++++++++++++++++++")
    for (i in 5..1)
        println(i)


    print("for (i in 5 downTo 1) print(i) = ")
    for (i in 5 downTo 1) print(i)
    println()

    println("++++++++++++++++++++++++++++++++++++++++++++fo(i in range 5 down to 2  print(i)++++++++++++++++++++++++++++++++")

    for (j in 5 downTo 2)
        println(j)
    println()


    println("++++++++++++++++++++++++++++++++++++++++++++fo(i in range 5 down to 2  print(i)++++++++++++++++++++++++++++++++")

    print("for (i in 1..5 step 2) print(i) = ")
    for (i in 1..5 step 2)
        println(i)
    println()


    println("++++++++++++++++++++++++++++++++++++++++++++fo(i in range 5 down to 2  print(i)++++++++++++++++++++++++++++++++")
        print("for (i in 5 downTo 1 step 2) print(i) = ")
        for (i in 5 downTo 1 step 2)
            println(i)

}