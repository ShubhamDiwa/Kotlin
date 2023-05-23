package Flows

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking{

launch { Dispatchers.Main

    producer().flowOn(Dispatchers.Main).collect{
        println("${it}")
    }

}

}

private fun producer(): Flow<Int> {
    return flow {
        val list= listOf<Int>(1,2,3,4,5,6,8,9,10)
        list.forEach {
            delay(1000)
            emit(it)
        }
    }
}