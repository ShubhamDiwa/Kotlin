package Generics

class generics {
}

fun main() {
    val stringList: ArrayList<String> = arrayListOf<String>("Ashu","Ajay")
    stringList.printValue()

    val DoubleList:ArrayList<Double> = arrayListOf<Double>(20.0,25.0)
    DoubleList.printValue()



    val floatList: ArrayList<Float> = arrayListOf<Float>(10.5f,5.0f,25.5f)
    floatList.printValue()
}
fun<T>ArrayList<T>.printValue() {
    for (element in this) {
        println(element)
    }
}