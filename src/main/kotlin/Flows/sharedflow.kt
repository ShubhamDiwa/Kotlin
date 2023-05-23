package Flows

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {


//    launch(Dispatchers.IO) {
//        val result = Producer()
//        result.collect{
//            println("Item - $it")
//        }
//
//    }

    launch(Dispatchers.IO) {
        val result = Producer()
        delay(6000)
        result.collect{
            println("Item - $it")
        }

    }

}

//private suspend fun producer():Flow<Int> {
//    val mutableSharedFlow= MutableSharedFlow<Int>(2)
//    val list= listOf<Int>(1,2,3,4,5,6,7,8,9)
//    list.forEach {
//        mutableSharedFlow.emit(it)
//        delay(1000)
//    }
//    return mutableSharedFlow
//}
private suspend fun producer():Flow<Int> {
    val mutableStateFlow= MutableStateFlow(10)
    delay(200)
   mutableStateFlow.emit(20)
    delay(1000)
    mutableStateFlow.emit(30)
    return mutableStateFlow
}