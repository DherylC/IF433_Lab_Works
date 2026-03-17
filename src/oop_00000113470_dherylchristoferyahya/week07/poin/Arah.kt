package oop_00000113470_dherylchristoferyahya.week07.poin

enum class Arah(val petunjuk: String) {
    Atas ("naik"),
    Bawah ("turun"),
    Kiri ("belok"),
    Kanan ("mengsong");

    fun showParam(){
        println("arah ke ${petunjuk}")
    }
}

