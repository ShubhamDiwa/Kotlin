package extension

class Circle(val radius :Double) {
    fun area():Double {
        return Math.PI* radius*radius
    }
}

fun main() {
    fun Circle.perimeter(): Double{
        return 2*Math.PI*radius;
    }


    val newCircle = Circle(2.5);
    println("Area of the circlr of ${newCircle.area()}")
    println("Area of the circlr of ${newCircle.perimeter()}")

    println("Hello CheezyCodes ".formattedString())

}

fun String.formattedString():String {
    return "----------------------------\n$this\n________________________________"
}