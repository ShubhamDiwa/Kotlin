package controlflow

fun main() {
    var i=1
    while (i<9){
        println(i)
        i++
        if (i==5)
            break

    }


    println("........................................................................................................")
    var j=1
    while (j<9){
        if (j==6){
            j++
            continue
        }
        println(j)
        j++

    }









}