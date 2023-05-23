package coroutine

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main()= runBlocking {// block the main thread
//    val time = measureTimeMillis {
//        val one = doSomethingusefulione()
//        val two =doSomthingUsefulTwo()
//        println("The answer is ${one + two}")
//    }
//    println("Completed in $time ms")

  val job: Job=  launch {// this will launch the child thread
        println("Fake work Started :${Thread.currentThread().name}")

        delay(1000)
        println("Fake work Finished :${Thread.currentThread().name}")
    }
  job.join()// will work as delay
    // job.cancel  can be used for cancelling the coroutine

    println("main work Finished :${Thread.currentThread().name}")

}

suspend fun doSomthingUsefulTwo(): Int {
    delay(1000)

    return 13

}

suspend fun doSomethingusefulione(): Int {
    delay(1000L)
    return 29

}
