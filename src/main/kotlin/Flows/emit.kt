package Flows

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking{

    launch(Dispatchers.IO){
        producer()
            .map { it*2 }
           .filter { it<8 }
//            .onStart {
//                emit(-1)
//                println("Starting Out")
//            }
//            .onCompletion {
//                emit(6)
//                println("completed")
//            }
//            .onEach {
//                println("about to emit ${it}")
//            }
            .collect{
                println("${it}")
            }


    }

}



private fun producer():Flow<Int>{
    return flow {
        val list= listOf<Int>(1,2,3,4,5,6,8,9,10)
        list.forEach {
            delay(1000)
            emit(it)
        }
    }
}