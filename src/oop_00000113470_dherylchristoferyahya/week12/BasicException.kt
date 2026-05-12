package oop_00000113470_dherylchristoferyahya.week12

fun divide( a: Int, b: Int): Int {
    try {
        return a / b
    } catch (e: ArithmeticException) {
        println("error: ${e.message}")
        return -1
    } finally {
        println("Division attempt finished.")
    }
}