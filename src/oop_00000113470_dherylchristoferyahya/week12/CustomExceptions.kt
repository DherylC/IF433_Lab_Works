package oop_00000113470_dherylchristoferyahya.week12

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")

class BankAccount(var balance: Double) {
    fun withdraw(amount: Double){
        if(amount < 0){
            throw IllegalArgumentException("Amount must be positive")
        }
        if(amount > balance){
            throw InsufficientFundsException(amount, balance)
        }
        balance -= amount
        println("Withdrawal successful. Balance: $balance")
    }
}

fun main(){
    println("=== TEST MULTIPLE CATCH ===")
    val account = BankAccount(100.0)

    try{
        account.withdraw(150.0)
    } catch (e: InsufficientFundsException) {
        println("Caught domain error: Uang tidak cukup. ${e.message}")
    } catch (e: IllegalArgumentException) {
        println("Caught argument error: Input tidak valid. ${e.message}")
    } catch (e: Exception) {
        println("Caught general error: terjadi kesalahan tidak terduga")
    }
}