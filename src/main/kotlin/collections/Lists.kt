package collections

fun main() {
    val fruits = listOf("apple", "banana", "orange", "grape")
    println("First fruit: ${fruits[0]}")
    println("Last fruit:${fruits.last()}")

    for (fruits in fruits)
        println(fruits)


    // Filter the list
    val filtered = fruits.filter { it.startsWith("a") }
    println(filtered)

    val filter=fruits.filter {it.startsWith("b") }
    println("Filtered list: $filter")

    // immutable list


}

