package oop_00000113470_dherylchristoferyahya.week02
import java.util.Scanner

class Loan(
    val bookTitle: String,
    val borrower: String,
    var loanDuration: Int = 1
) {
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }
}

fun main(){
    val scanner = Scanner(System.`in`)

    println("--- Library Loan System ---")

    print("Masukkan Judul: ")
    val title = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val name = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    if (duration < 0) {
        duration = 1
    }

    val loanEntry = Loan(title, name, duration)

    println("\n--- Detail Peminjaman ---")
    println("Judul Buku    : ${loanEntry.bookTitle}")
    println("Peminjam      : ${loanEntry.borrower}")
    println("Lama Pinjam   : ${loanEntry.loanDuration} hari")
    println("Total Denda   : Rp ${loanEntry.calculateFine()}")
}