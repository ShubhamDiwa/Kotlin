package SealedClass

sealed class Shape {

    class Circle(var radius:Float):Shape()
    class Square(var length:Float):Shape()
    class Rectangle(var length: Int, var breadth: Int): Shape()

}
fun eval(e:Shape)=
    when(e){
        is Shape.Circle -> println(" area of circle:${3.14 * e.radius *e.radius}")
        is Shape.Square -> println("area if Square:${e.length * e.length}")
        is Shape.Rectangle -> println("area of Rectangle:${e.length * e.breadth}")

        else -> {
            println(" this is empty block of else ")
        }
    }
fun main() {
    var circle=Shape.Circle(5.0f)
    var square=Shape.Square(5F)
    var rectangle=Shape.Rectangle(5,6)

    println("circle:$circle"+"square:$square"+"rectangle:$rectangle")

    eval(square)
    eval(circle)
    eval(rectangle)

}
