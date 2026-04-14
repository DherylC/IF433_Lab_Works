package oop_00000113470_dherylchristoferyahya.week08

fun main(){
    println("=== TEST SAFE & ELVIS ===")
    val emptyOrder = Order(null, null)
    val destination = emptyOrder.deliveryDetails?.address?.city?.name?:"Kota tidak diketahui"
    println("Tujuan pengiriman $destination")
}