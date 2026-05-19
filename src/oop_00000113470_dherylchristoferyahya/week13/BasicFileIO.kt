package oop_00000113470_dherylchristoferyahya.week13
import java.io.File

fun main(){
    println("=== TEST WRITE TEXT ===")
    val file = File("notes.txt")
    file.writeText("Line1: Inisialisasi sistem\n")
    println("File berhasil dibuat dan ditulis")

    file.appendText("Line 2: Menambahkan kongifurasi baru \n")
    println("teks berhasil di append")
}