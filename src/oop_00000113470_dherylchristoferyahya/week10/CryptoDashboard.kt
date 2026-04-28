package oop_00000113470_dherylchristoferyahya.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.05))
    coinRepo.add(Coin("ETH", 2.5))
    coinRepo.add(Coin("USDT", 2400.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status Respon: ${response.status}")
    println("Daftar koin yang diterima:")
    response.data.forEach { coin ->
        println("- Nama: ${coin.name}, Saldo: ${coin.balance}")
    }
}