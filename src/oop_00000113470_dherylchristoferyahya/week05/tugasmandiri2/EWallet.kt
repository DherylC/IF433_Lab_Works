package oop_00000113470_dherylchristoferyahya.week05.tugasmandiri2

class EWallet(accountName: String, var balance: Double = 0.0) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran Berhasil! Sisa saldo $accountName: Rp$balance")
        } else {
            println("Pembayaran Gagal: Saldo tidak cukup untuk akun $accountName.")
        }
    }

    fun topUp(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Top-up Berhasil! Saldo $accountName saat ini: Rp$balance")
        } else {
            println("Jumlah top-up tidak valid.")
        }
    }
}