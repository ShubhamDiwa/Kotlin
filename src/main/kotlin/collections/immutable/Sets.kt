package collections.immutable

fun main() {
    // immutavble set

    // sets support unique values elements

    var immutableSet = setOf(6,9,9,0,0,"Mahipal","Nikhil") // initialize with duplicate values

    for(item in immutableSet){
        println(item)   // but output with no repetition
    }
    // no adding values only retrieving values
}

