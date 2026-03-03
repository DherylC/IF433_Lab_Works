package oop_00000113470_dherylchristoferyahya.week05.tugasmandiri2

abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)

    fun printReceipt() {
        println("Mencetak struk untuk $accountName...")
    }
}