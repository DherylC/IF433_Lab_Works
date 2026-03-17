package oop_00000113470_dherylchristoferyahya.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()
}