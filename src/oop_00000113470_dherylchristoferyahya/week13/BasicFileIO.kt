package oop_00000113470_dherylchristoferyahya.week13

class BasicFileIO {
    fun main(){
        println("=== TEST WRITE TEXT ===")
        val file = File("notes.txt")
        file.writeText("Line1: Inisialisasi sistem\n")
        println("File berhasil dibuat dan ditulis")
    }
}