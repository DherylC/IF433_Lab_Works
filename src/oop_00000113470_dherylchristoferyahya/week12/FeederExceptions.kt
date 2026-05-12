package oop_00000113470_dherylchristoferyahya.week12

sealed class FeederException(msg: String) : Exception(msg)

class FoodEmptyException(requested: Int, available: Int) : FeederException("Kibble tidak cukup! Diminta $requested gr, sisa $available gr")

class DispenserJamException : FeederException("Wadah dispenser tersangkut/macet!")

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    println("=== Jadwal Makan Pagi ===")
    try {
        currentKibbleStock = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )
    } catch (e: DispenserJamException) {
        println("Error Hardware: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Error Stok: ${e.message}")
    } catch (e: Exception) {
        println("Terjadi kesalahan tidak terduga: ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    println("=== Jadwal Makan Pagi 2 ===")
    runCatching {
        dispenseKibble(requestedGram = 30, availableGram = 1000, isJammed = false)
    }.onSuccess { newStock ->
        currentKibbleStock = newStock
        println("Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr")
    }
}