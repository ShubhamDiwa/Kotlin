package controlflow

fun main() {

    val marks = arrayOf(80, 85, 60, 90, 70)
    for (item in marks) {
        println(item)
    }

    val  draks= arrayOf(10,20,40,30,50)
    for (item in draks.indices)
        println("draks[$item]:"+draks[item])
}