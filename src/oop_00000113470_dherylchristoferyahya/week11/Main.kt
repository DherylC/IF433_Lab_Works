package oop_00000113470_dherylchristoferyahya.week11

fun main(){
    println("=== TEST EXTENSION FUNCTION ===")
    println("Alex".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String? = null
    println("apakah null/empty? ${text.isNullOrEmptyCustom()}")
}