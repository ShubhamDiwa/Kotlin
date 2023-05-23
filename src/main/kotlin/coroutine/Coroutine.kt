package coroutine

import kotlinx.coroutines.*

fun main()= runBlocking {
   val job= launch (Dispatchers.Default){
        repeat(5){
            i ->
            try {
                println("Hello World   ")
            }catch (e :Exception){
                println(e)
            }
        }
    }
    delay(1300L) // delay a bit
    println("main: I'm tired of waiting!")
    job.cancelAndJoin() // cancels the job and waits for its completion
    println("main: Now I can quit.")

}