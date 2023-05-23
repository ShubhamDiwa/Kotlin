package Flows

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.ProducerScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

fun main(): Unit = runBlocking {

   val job:Job= launch {
        val data:Flow<Int> = Producer()
        data.collect{
            println(it)
        }
    }
//    launch {
//        delay(3500)
//        job.cancel()// to cancel flow we have to suspend  the observer or launcher
//    }




}


suspend fun Producer()  = flow<Int>{
    val list = listOf<Int>(1,2,3,4,5,6,7,8,9)
    list.forEach{
        delay(1000)
        emit(it)
    }
}