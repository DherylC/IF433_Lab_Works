package oop_00000113470_dherylchristoferyahya.week10

fun main(){
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val stringBox = Box("Generics in Kotlin")

    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")

    println("\n=== TEST GENERIC CLASS ===")
    val itemPrice = PairBox("Bitcoin", 100)
    println("Aset: ${itemPrice.key}, Harga: ${itemPrice.value}")

    println("\n=== TEST GENERIC FUNCTIONS ===")
    printData(3.14)
    val result = processData("Stablecoin")
    println("Hasil Proses: $result")

    println("\n=== TEST CONSTRAINTS ===")
    val math = MathBox(10.5, 20)
    printData("Total: ${math.sum()}")
    println("Terbesar: ${math.getMax(45, 90)}")
}