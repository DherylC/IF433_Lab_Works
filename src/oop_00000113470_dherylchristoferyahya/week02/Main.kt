package oop_00000113470_dherylchristoferyahya.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    println ("Aplikasi PMB UMN")

    print ("Masukkan Nama: ")
    val name = scanner.nextLine()

    print ("Masukkan NIM (5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if(nim.length != 5){
        println("ERROR! Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Masukkan jurusan: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim, major)
        println("Status Pendaftaran selesai.")
    }


}