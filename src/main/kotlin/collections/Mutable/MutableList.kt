package collections.Mutable

fun main() {
    var mut = mutableListOf<String>("Abhi", "Sekh", "Shubham", "Diwakar")
    mut.add("Viranch")
    mut[1] = "hare Krishna"

    for (i in mut)
        println(i)


    var mutableList = mutableListOf("Mahipal", "Nikhil", "Rahul")
    // we can modify the element
    mutableList[0] = "Praveen"
    // add one more element in the list
    mutableList.add("Abhi")
    for (item in mutableList) {
        println(item)
    }


    var mutableSet = mutableSetOf<Int>(6,10)
    // adding elements in set
    mutableSet.add(2)
    mutableSet.add(5)
    for(item in mutableSet){
        println(item)
    }


    var mutableMap= mutableMapOf<Int,String>(1 to "viranch",2 to "Shubham",3 to "Abhisekh",4 to "Dev")
    mutableMap.put(2,"manish")
    mutableMap.put(5 ,"phone ")

    for(item in mutableMap)
        println(item)

}