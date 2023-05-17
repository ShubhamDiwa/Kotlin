package collections.immutable

fun main() {

    // immutable type of list
    val immutablelist = listOf<String>("String","Shubham","Aman","Bharat bhaii")
    for(i in immutablelist)
        println(i)


  println(immutablelist.reversed())
    println(immutablelist[2])


}