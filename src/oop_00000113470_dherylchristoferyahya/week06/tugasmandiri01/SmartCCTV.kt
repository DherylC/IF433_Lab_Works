package oop_00000113470_dherylchristoferyahya.week06.tugasmandiri01

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("CCTV $name (ID: $id) diaktifkan.")
        startRecord()
    }

    override fun turnOff() {
        println("CCTV $name (ID: $id) dinonaktifkan.")
    }

    override fun startRecord() {
        println("[$name] Mulai merekam video ke penyimpanan lokal...")
    }
}