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

    println("=== TEST APPLY ===")
    val user = User().apply {
        name = "Alex"
        age = 25
    }
    println(user)

    println("=== TEST ALSO ===")
    val numbers = mutableListOf(1, 2, 3)
    numbers.also {
        println("Log sebelum ditambah: $it")
    }.add(4)
    println("setelah ditambah: $numbers")
}