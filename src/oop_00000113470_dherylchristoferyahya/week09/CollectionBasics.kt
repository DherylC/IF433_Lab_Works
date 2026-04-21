package oop_00000113470_dherylchristoferyahya.week09

fun main(){
    println("===TEXT LIST===")
    val frameworks:List<String> = listOf("Kotlin", "Java", "C++")
    println("Immutable List: $frameworks")

    val scores: MutableList<Int> = mutableListOf(85,90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")
}