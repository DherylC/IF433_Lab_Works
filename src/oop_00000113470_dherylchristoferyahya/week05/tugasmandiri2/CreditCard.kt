package oop_00000113470_dherylchristoferyahya.week05.tugasmandiri2

class CreditCard(accountName: String, val limit: Double, var usedAmount: Double = 0.0) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            val remainingLimit = limit - usedAmount
            println("Pembayaran Kartu Kredit Berhasil! Nama: $accountName")
            println("Pemakaian saat ini: Rp$usedAmount | Sisa limit: Rp$remainingLimit")
        } else {
            println("Transaksi Ditolak: Pembayaran sebesar Rp$amount melebihi limit kartu $accountName.")
        }
    }

    fun payBill(payment: Double) {
        usedAmount -= payment
        if (usedAmount < 0) usedAmount = 0.0
        println("Tagihan dibayar. Pemakaian saat ini: Rp$usedAmount")
    }
}