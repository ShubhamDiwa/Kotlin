package collections.immutable


fun main() {


    var immutableMap = mapOf(9 to "Mahipal",8 to "Nikhil",7 to "Rahul")

//    // gives compile time error
//    // immutableMap.put(9,"Praveen")
    for (i in immutableMap)
        println("${i.key} = ${i.value}")



}