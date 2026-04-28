package oop_00000113470_dherylchristoferyahya.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("Bitcoin", 0.05))
    coinRepo.add(Coin("Ethereum", 2.0))
    coinRepo.add(Coin("Solana", 15.0))

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