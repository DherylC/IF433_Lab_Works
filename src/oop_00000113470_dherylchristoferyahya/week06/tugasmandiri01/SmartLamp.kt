package oop_00000113470_dherylchristoferyahya.week06.tugasmandiri01

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Lampu Pintar $name (ID: $id) menyala dengan terang.")
    }

    override fun turnOff() {
        println("Lampu Pintar $name (ID: $id) dimatikan.")
    }
}