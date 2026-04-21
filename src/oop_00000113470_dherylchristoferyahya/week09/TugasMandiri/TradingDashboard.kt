package oop_00000113470_dherylchristoferyahya.week09.TugasMandiri

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 5, 8.0, "OPEN"),
        TradeLog("ETHUSDT", "SHORT", 20, -12.4, "OPEN"),
        TradeLog("BTCUSDT", "LONG", 10, 2.1, "OPEN"),
        TradeLog("ETHUSDT", "LONG", 10, -3.5, "CLOSED")
    )

    println("==========================================================")
    println("                   TRADING DASHBOARD                      ")
    println("==========================================================")

    tradeHistory.forEach { trade ->
        val profitOrLoss = if (trade.roe >= 0) "PROFIT" else "LOSS"
        println("${trade.pair.padEnd(8)} | ${trade.position.padEnd(5)} | Leverage: ${trade.leverage}x | ROE: ${trade.roe}% | Status: ${trade.status} ($profitOrLoss)")
    }

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

    println("Jumlah transaksi tertutup: ${closedTrades.size}")
    closedTrades.forEach { println(it) }

    val winningTrades = closedTrades.filter { it.roe > 0 }

    println("Jumlah transaksi untung: ${winningTrades.size}")
    winningTrades.forEach { println(it) }

    val losingTrades = closedTrades.filter { it.roe <= 0 }

    println("Jumlah transaksi rugi: ${losingTrades.size}")
    losingTrades.forEach { println(it) }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    topPerformersString.forEach { println(it) }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    println("Daftar Performa Terburuk:")
    worstPerformersString.forEach { println(it) }

    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    println("Pasangan koin yang pernah ditradingkan: $uniquePairs")

    topPerformersString.forEach {
        println(it)
    }

    println("\n--- DAFTAR LOSS ---")
    worstPerformersString.forEach {
        println(it)
    }

    println("\n--- KOIN YANG DITRADINGKAN ---")
    println(uniquePairs)

    println("==========================================================")
}