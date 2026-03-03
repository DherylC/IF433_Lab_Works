package oop_00000113470_dherylchristoferyahya.LEC

open class Kendaraan {
    private var merk: String = "";
    private var kecepatan: Int = 0;

    open fun maju(){ //final, gabisa sama ama child
        println("Jalan!!! kecepetan $kecepatan");
    }
}