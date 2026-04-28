package oop_00000113470_dherylchristoferyahya.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items.toList()
    }

    fun <T : Named> WalletRepository<T>.findByName(name: String): T? {
        return this.getAll().find { it.name.equals(name, ignoreCase = true) }
    }
}