package Map

fun main() {
//    val hashMap:HashMap<Int, String> = HashMap<Int ,String>()
//    hashMap.put(1,"Ajay")
//    hashMap.put(2,"Vijay")
//    hashMap.put(3,"Praveen")
//    hashMap.put(4,"himanshu")
//    hashMap.put(5,"Manish")
//
//    for (key in hashMap.keys)
//        println("$key=${hashMap[key]}")

    val myMap = hashMapOf<String, Int>()

    // add elements to the HashMap
    myMap.put("apple", 1)
    myMap.put("banana", 2)
    myMap.put("orange", 3)

    // print the HashMap
    println(myMap)

    // remove an element from the HashMap
    myMap.remove("banana")

    // print the updated HashMap
    println(myMap)

    // check if a key is present in the HashMap
    val containsKey = myMap.containsKey("apple")
    println("Contains key 'apple': $containsKey")

    // check if a value is present in the HashMap
    val containsValue = myMap.containsValue(3)
    println("Contains value 3: $containsValue")


}

