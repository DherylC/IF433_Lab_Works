package oop_00000113470_dherylchristoferyahya.week13
import java.io.File

fun main(){
    println("=== TEST UNSAFE RESOURCE HANDLING ===")
    val unsafeFile = File("unsafe_logs.txt")
    val writer = unsafeFile.printWriter()

    writer.println("Log 1: Membuka koneksi database")
    writer.println("Log 2: Menulis data pengguna")

    writer.close()
    print("Proses penulisan unsafe selesai")

    println("=== TEST SAFE RESOURCE HANDLING ===")
    val safeFile = File("safe_logs.txt")

    safeFile.printWriter().use { out ->
        for (i in 1..100){
            out.println("Safe Log entry $i: System Status OK")
        }
    }
    println("100 baris log berhasil generate dengan aman")
}