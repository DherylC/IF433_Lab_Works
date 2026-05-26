package oop_00000113470_dherylchristoferyahya.week14
import java.io.File

class BadOrderProcessor {
    private val file = ("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")

        file.appendText("$itemName, $finalPrice, $customerType")

        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi")
    }
}

interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

class CsvOrderRepository(private val fileName: String = "orders.csv") : OrderRepository {
    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        val file = File(fileName)
        // Menggunakan bufferedWriter dan blok 'use' untuk safe resource handling
        file.bufferedWriter().use { writer ->
            writer.write("$itemName, $finalPrice, $customerType\n")
        }
    }
}

interface NotificationService {
    fun sendNotification(itemName: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(itemName: String) {
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi")
    }
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {
    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")

        repo.saveOrder(itemName, finalPrice, customerType)

        notifier.sendNotification(itemName)
    }
}