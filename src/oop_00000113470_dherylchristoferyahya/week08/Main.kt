package oop_00000113470_dherylchristoferyahya.week08

fun main(){
    println("=== TEST SAFE & ELVIS ===")
    val emptyOrder = Order(null, null)
    val destination = emptyOrder.deliveryDetails?.address?.city?.name?:"Kota tidak diketahui"
    println("Tujuan pengiriman $destination")

    println("=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)
    val receipt = validOrder.totalPrice?.let { price ->
        val tax = price * 0.11
        "Transaksi valid, Harga: Rp$price, Pajak Rp$tax"
    } ?: "Transaksi invalid: harga belum di set"

    println(receipt)
}