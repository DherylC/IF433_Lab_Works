package oop_00000113470_dherylchristoferyahya.week06.tugasmandiri01


class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Smart Speaker $name menyala dan siap menerima perintah suara.")
    }

    override fun turnOff() {
        println("Smart Speaker $name dimatikan.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}