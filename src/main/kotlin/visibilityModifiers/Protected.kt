package visibilityModifiers

open class Protected {
    protected val int = 10
}
class b:Protected(){
    fun getValue():Int {
        return int
    }


}

fun main() {
    var a=b()
    println(a.getValue())
}