package Map

import java.security.Key

fun main() {
    val myMap= mapOf<Int,String>(1 to "Ajay", 2 to "Toufik",3 to "Rafi",4 to " mouse ")
    for (key in myMap.keys)
        println("Element in key $key =${myMap.get(key)}")
    println(myMap.getValue(4))
    println(myMap.contains(2))
    println(myMap.containsValue("Toufik"))

    val map= mapOf<Int ,String>(1 to "Aman", 2 to " Shubham ", 3 to " kiran ", 4 to " simran")
    for(key in map.keys){
        println("Element at key $key = ${myMap.get(key)}")
    }
    println(".....myMap.get(1).......")

}

