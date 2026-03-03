package oop_00000113470_dherylchristoferyahya.LEC

class Mobil: Kendaraan() {
    private var jml_ban:Int = 0;
    init {
        jml_ban = 4;
        println("Mobil saya bannya ada: $jml_ban");
    }

}