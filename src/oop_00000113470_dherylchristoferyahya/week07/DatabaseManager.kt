package oop_00000113470_dherylchristoferyahya.week07

object  DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect(){
        connectionStatus = "Connected to server"
        println("Database is ready.")
    }
}