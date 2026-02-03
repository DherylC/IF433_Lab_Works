package oop_00000113470_dherylchristoferyahya.week01

fun main() {
    val gameTitle = "Minecraft"
    val price = 199000
    val discountPrice = calculateDiscount(price)
    val finalPrice = price - discountPrice
    val userNote: String? = null
    printReceipt(title = gameTitle, price = price, finalPrice = finalPrice)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

fun printReceipt(title: String, price: Int, finalPrice: Int, userNote: String? = null) {
    println("---// Receipt //---")
    println("Title: $title")
    println("Harga Asli : Rp $price")
    println("Harga Akhir: Rp $finalPrice")

    println("Note: ${userNote ?: "Tidak ada catatan"}")
}