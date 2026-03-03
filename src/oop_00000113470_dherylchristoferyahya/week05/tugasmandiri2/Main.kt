package oop_00000113470_dherylchristoferyahya.week05.tugasmandiri2

fun main() {
    val gopay = EWallet(accountName = "Budi E-Wallet", balance = 50000.0)
    val bcaPlatinum = CreditCard(accountName = "Budi Credit Card", limit = 100000.0)

    val daftarPembayaran: List<PaymentMethod> = listOf(gopay, bcaPlatinum)

    println("Result:")

    for (metode in daftarPembayaran) {
        metode.processPayment(75000.0)
        println("-----------")
    }
}