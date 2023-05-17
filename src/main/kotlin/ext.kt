fun main() {
    var s = "Abhishek and Shubham".serial()
    println(s)
}

fun String.serial(): String{
    return "---------\n$this\n---------"
}