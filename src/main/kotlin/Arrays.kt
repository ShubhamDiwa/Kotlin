fun main() {
    var myArray1 = arrayOf(1, 10, 4, 6, 15)
    var myArray2 = arrayOf<Int>(1, 10, 4, 6, 15)
    val myArray3 = arrayOf<String>("Ajay", "Prakesh", "Michel", "John", "Sumit")
    var myArray4 = arrayOf(1, 10, 4, "Ajay", "Prakesh")

    for(item in myArray1)
println(item)

println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")

    // set in kotlin


    val array1 = arrayOf(1,2,3,4)
    val array2 = arrayOf<Long>(11,12,13,14)
    array1.set(0,5)
    array1[2] = 6


    for (element in array1)
        println(element)

    println("___________________________________________________________________________")

    // get in kotlin

    val array4 = arrayOf(1,2,3,4)

    val array6= arrayOf<Long>(11,12,13,14)

    println(array4.get(0))
    println(array4[2])
    println()


//    println(array2.get(2))
//    println(array2[3])
}