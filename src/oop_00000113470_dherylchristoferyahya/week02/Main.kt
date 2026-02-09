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
        println("Status: Pendaftaran selesai.")

        print("Pilih Jalur (1. Reguler, 2. Umum): ")
        val type = scanner.nextInt()
        scanner.nextLine()

        if(type == 1){
            print("Masukkan Jurusan: ")
            val major = scanner.nextLine()

            val s1 = Student(name, nim, major = major)
            println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
        } else if (type == 2){
            val s2 = Student(name, nim)
            println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
        } else {
            println("Pilihan ngawur, pendaftaran batal!")
        }
    }
}