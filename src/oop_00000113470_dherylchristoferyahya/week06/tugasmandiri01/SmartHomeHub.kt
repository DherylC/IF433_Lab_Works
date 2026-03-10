package oop_00000113470_dherylchristoferyahya.week06.tugasmandiri01

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("${device.name} berhasil ditambahkan ke Hub.")
    }

    fun turnOffAllSwitches() {
        println("Mematikan Seluruh Perangkat Switchable")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }

    fun activateSecurityMode() {
        println("\nMENGAKTIFKAN SECURITY MODE")
        for (device in devices) {
            if (device is Recordable) {
                device.startRecord()
            }

            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan")
            }
        }
    }
}