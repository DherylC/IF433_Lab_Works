package oop_00000113470_dherylchristoferyahya.week06

class Smartwatch: Watch(), BluetoothConnectable, Rechargeable {
    override fun showTime(){
        println("Layar OLED menyala: 14:00 WIB")
    }

    override fun connectToBluetooth() {
        println("Mencari perangkat HP di sekitar unutk pairing...")
    }

    override fun chargeBattery(){
        println("Mengisi daya menggunakan charger magnetik 15W")
    }
}