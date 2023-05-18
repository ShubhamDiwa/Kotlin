package visibilityModifiers

open class `Base()` {
    var a = 1 // public by default
    private var b = 2 // private to Base class
    protected open val c = 3  // visible to the Base and the Derived class
    internal val d = 4 // visible inside the same module
    protected fun e() { } // visible to the Base and the Derived class
}

class Derived : `Base()`() {
    override val c: Int
        get() = super.c

    internal var abh= 10
}



fun main(){
    var a = Derived()
    a.abh = 11


}