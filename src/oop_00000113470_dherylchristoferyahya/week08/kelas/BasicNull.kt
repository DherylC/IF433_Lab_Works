package oop_00000113470_dherylchristoferyahya.week08.kelas

class Alamat(val kota: String?)
class Mahasiswa(val address: Alamat)

fun main(){
   val mhs1 = Mahasiswa(Alamat("Jakarta"))
   val mhs2 = Mahasiswa(Alamat(null))

    println("mhs1: ${mhs1.address.kota}")
    println("mhs2: ${mhs2.address.kota}")

    val tetapAlamat = Alamat(null)
    val defaultAlamat = tetapAlamat.kota?.let {
        adrs ->"alamat adalah $adrs"
    } ?: "Alamat kosong"
    println("Alamat kamu: ${defaultAlamat}")
}