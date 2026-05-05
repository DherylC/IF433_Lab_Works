package oop_00000113470_dherylchristoferyahya.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    homeDevices.add(SmartDevice("Philips WiZ Living Room", "Lighting", true, 12))
    homeDevices.add(SmartDevice("Ezviz Outdoor", "Camera", true, 5))
    homeDevices.add(SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800))
    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))

    val acUnit = run {
        val device = SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
        device
    }
    homeDevices.add(acUnit)

    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let {
        println("\n--- Hasil Pencarian Keamanan ---")
        val hasilDiagnose = it.diagnose()
        println(hasilDiagnose)
    }

    with(homeDevices) {
        println("\n--- Rangkuman Sistem ---")
        println("Jumlah perangkat terdaftar: ${this.size}")
        println("Total entitas di dashboard: $size")
    }

    val totalPower = homeDevices.run {
        sumOf { it.powerLoad }
    }
    println("Total beban daya seluruh perangkat: $totalPower Watt")

    println("\n--- Status Dashboard Smart Home ---")
    homeDevices.forEach { println(it.diagnose()) }
}
