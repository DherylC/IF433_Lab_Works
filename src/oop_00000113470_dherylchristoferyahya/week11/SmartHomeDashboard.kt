package oop_00000113470_dherylchristoferyahya.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice("", "").apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    val acUnit = run {
        val device = SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
        device
    }
    homeDevices.add(acUnit)

    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))

    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let {
        println("\n--- Hasil Pencarian Keamanan ---")
        println(it.diagnose())
    }

    with(homeDevices) {
        println("\n--- Rangkuman Sistem ---")
        println("Jumlah perangkat terdaftar: ${this.size}")
    }

    val totalPower = homeDevices.run { sumOf { it.powerLoad } }
    println("Total beban daya seluruh perangkat: $totalPower Watt")

    println("\n--- Eksekusi Diagnosa Seluruh Perangkat ---")
    homeDevices.forEach { device ->
        println(device.diagnose())
    }
}
