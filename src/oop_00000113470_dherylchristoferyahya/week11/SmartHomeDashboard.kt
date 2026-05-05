package oop_00000113470_dherylchristoferyahya.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice(name = "", category = "").apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
        println("Sistem: Perangkat '${it.name}' berhasil ditambahkan ke dashboard.")
    }

    println("\nDaftar Perangkat Saat Ini:")
    homeDevices.forEach { println(it.diagnose()) }
}