package oop_00000113470_dherylchristoferyahya.week11

fun main(){
    println("=== TEST EXTENSION FUNCTION ===")
    println("Alex".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String? = null
    println("apakah null/empty? ${text.isNullOrEmptyCustom()}")

    println("=== TEST RUN FUNCTION ===")
    val result = "Kotlin".run {
        println("Memproses Kata: $this")
        length * 2
    }
    println("Hasil kalkulasi run: $result")
}