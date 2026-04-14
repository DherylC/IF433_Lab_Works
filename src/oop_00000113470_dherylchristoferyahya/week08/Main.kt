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

    println("\n=== TEST SAFE CASTING ===")
    val mixedData : List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Andi",null),
        "Laptop",
        4500000.0
    )

    for(item in mixedData){
        val text = item as? String
        text?.let {
            println("ditemukan teks: ${it.uppercase()}")
        }
    }

    val someObject: Any = 100
    val safeString = someObject as? String ?: "Unknown string"
    println("Hasil cast + fallback: ${safeString}")

    println("\n=== TEST THE RED BTN ===")
    val toxicData: String? = null
    try {
        val length = toxicData!!.length
    } catch (e: NullPointerException) {
        println("sembarangan amat")
    }
}


