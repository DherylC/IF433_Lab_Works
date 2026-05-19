package oop_00000113470_dherylchristoferyahya.week02
import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String {
    return "$id,$symbol,$type,$margin,$pnl"
}

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val tokens = line.split(",")
        if (tokens.size != 5) return null

        val id = tokens[0].trim().toInt()
        val symbol = tokens[1].trim()
        val type = tokens[2].trim()
        val margin = tokens[3].trim().toDouble()
        val pnl = tokens[4].trim().toDouble()

        TradeRecord(id, symbol, type, margin, pnl)
    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("(Log) File tidak ditemukan di $path. Mengembalikan list kosong.")
        emptyList()
    }
}

fun main() {
    val filePath = "crypto_trades.csv"

    // Mendefinisikan data simulasi riwayat trading (mock data)
    val mockTrades = listOf(
        TradeRecord(1, "BTCUSDT", "Long", 150.0, 45.25),
        TradeRecord(2, "ETHUSDT", "Short", 200.0, -12.80),
        TradeRecord(3, "XRPUSDT", "Long", 50.0, 8.10)
    )

    println("Menyimpan data simulasi ke $filePath...")
    saveTrades(mockTrades, filePath)
    println("Data berhasil disimpan.")

    println("\nMenyuntikkan baris data cacat ke $filePath untuk pengujian...")
    File(filePath).appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")
    println("Data cacat berhasil disuntikkan.")
}