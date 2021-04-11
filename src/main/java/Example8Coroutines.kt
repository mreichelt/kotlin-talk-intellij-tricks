import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.days

fun getAnswer(): Int {
    thinkDeep()
    return 42
}

fun thinkDeep() {
    val days = 7500000 * 365.2425 // 7.5 million years
//    delay(days.days)
}

fun main() {
    println(getAnswer())
}

fun main2() = runBlocking {
    val a = async {
        println("I'm computing part of the answer")
        6
    }
    val b = async {
        println("I'm computing another part of the answer")
        7
    }
    println("The answer is ${a.await() * b.await()}")
}

// calling a suspending function in non-suspending context is not possible
// automatically add suspend
// gutter icons for suspend functions
// Fresh: Coroutine debugger! 🎉🌟
