package oop_00000113470_dherylchristoferyahya.week08.TugasMandiri

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"),
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"),
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD")
    )

    val parser = ApiParser()

    println("--- Memulai Batch Collection ---")

    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)

            product?.let {
                parser.checkout(it)
            } ?: println("Log: Produk dilewati (Tipe tidak dikenal atau Null)")

        } catch (e: IllegalArgumentException) {
            println("Log Peringatan: Data korup ditemukan! - ${e.message}")
        }
    }

    println("--- DONE ---")
}