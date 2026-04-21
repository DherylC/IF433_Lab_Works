package oop_00000113470_dherylchristoferyahya.week09

fun main(){
    println("=== TEST LAMBDA ===")
    val sunLambda = {a: Int, b: Int -> a + b}
    println("Hasil Sun: ${sunLambda(5, 10)}")

    val squareImplicit: (Int) -> Int = {it * it}
    println("Hasil Square: ${squareImplicit(4)}")
}