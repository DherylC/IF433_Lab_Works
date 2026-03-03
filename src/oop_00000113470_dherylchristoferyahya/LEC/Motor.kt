package oop_00000113470_dherylchristoferyahya.LEC

class Motor: Kendaraan() {
    private var jml_ban:Int = 0;
    init {
        jml_ban = 2;
        println("motor saya bannya ada $jml_ban")
    }
    override fun maju(){
        println("Motor jalan");
    }
}