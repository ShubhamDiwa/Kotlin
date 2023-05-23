package coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    println("Main Program Started :${Thread.currentThread().name}")
    GlobalScope.launch {
        println("Fake work Started :${Thread.currentThread().name}")

        delay(1000)
        println("Fake work Finished :${Thread.currentThread().name}")
    }
    runBlocking {
        delay(2000)
    }

    println("main work Finished :${Thread.currentThread().name}")

}
suspend fun mySuspendFunc(time:Long) {
    delay(time)
}