package oop_00000113470_dherylchristoferyahya.week01

fun main() {
    val gameTitle = "Minecraft"
    val price = 199000
    val discountPrice = calculateDiscount(price)
    val finalPrice = price - discountPrice
    println("Title: $gameTitle, Harga Asli: $price, Harga Akhir: $finalPrice")
}

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()