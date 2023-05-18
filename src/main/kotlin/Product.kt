data class Product(val varitem: String, var price: Int)

fun main() {
    val p1 = Product("laptop", 25000)
    val p2= Product("laptop", 25000)
    println(p1==p2)
    println(p1.equals(p2))


    val p3=p1.copy()
    println(p3)
}


