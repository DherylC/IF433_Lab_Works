package oop_00000113470_dherylchristoferyahya.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.05))
    coinRepo.add(Coin("ETH", 2.5))
    coinRepo.add(Coin("USDT", 2400.0))

    println("--- Daftar Koin ---")
    coinRepo.getAll().forEach {
        println("Coin: ${it.name}, Saldo: ${it.balance}")
    }

    val target = "Ethereum"
    val found = coinRepo.findByName(target)

    println("\n--- Hasil Pencarian ---")
    if (found != null) {
        println("Ditemukan: ${found.name} dengan saldo ${found.balance}")
    } else {
        println("$target tidak ditemukan di dompet.")
    }
}