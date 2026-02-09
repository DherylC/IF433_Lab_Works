package oop_00000113470_dherylchristoferyahya.week02

import javax.swing.plaf.nimbus.NimbusStyle

class Student (
    val name: String,
    val nim: String,
    var major: String,
    var gpa: Double = 0.0,

    ) {
    constructor(name: String, nim: String) : this(name, nim, "Non-Matriculated", 0.0) {
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }

    init {
        if (nim.length != 5) {
            println("WARNING! Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data Mahasiswa $name mungkin bermasalah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory")
        }
    }
}