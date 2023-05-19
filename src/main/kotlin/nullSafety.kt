import java.util.*

class nullSafety

fun main() {
    var firstName: String? = "Praveen"
    var lastName: String? = null


    println(firstName?.uppercase(Locale.getDefault()))
    println(firstName?.length)
    println(lastName?.uppercase(Locale.getDefault()))

    var stringList:List<String?> = listOf("Geeks","for",null,"geeks")
    var newList= listOf<String?>()

    for (item in stringList ){
       // item?.let { newList = newList.plus(it) }
        item?.run { newList = newList.plus(this)
            item.also { it-> println(it) }
        }

    }
//
//    for (item in newList){
//        println(item)
//    }

// Elvis Operator

    println("/////////////////////////////////////////////////////////////////////////")

    val name: String? = null
    val displayName = name ?: "Guest"
    println(displayName) //


    println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")
}