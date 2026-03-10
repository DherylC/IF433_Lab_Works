package oop_00000113470_dherylchristoferyahya.week06.tugasmandiri01

fun main() {
    val hub = SmartHomeHub()

    val lamp = SmartLamp(id = "lamp", name = "Ruang Tamu")
    val speaker = SmartSpeaker(id = "speaker", name = "Google Nest Dapur")
    val cctv = SmartCCTV(id = "cctv", name = "Ezviz Garasi")

    println("INISIALISASI SMART HOME")
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    hub.turnOffAllSwitches()
    hub.activateSecurityMode()
}