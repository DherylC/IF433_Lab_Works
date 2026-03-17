package oop_00000113470_dherylchristoferyahya.week07.poin

import oop_00000113470_dherylchristoferyahya.week07.poin.Koneksi.coba_konek_db

fun main() {
    Koneksi.koneksi = "http://localhost:1313"
    println("link ${Koneksi.koneksi}")
    Koneksi.coba_konek_db();

    Hitungan.sum(10, 15)
    Hitungan.kali(10, 15)
    println("Nama Matkul: ${Hitungan.NAMAMTK}")

    val dt = SaveData("Admin", 44, 66, 67);
    println("nama karakter: ${dt.namaChar}")

    val dtCopy = dt.copy(namaChar = "Luigi")
    println("nama karakter: ${dtCopy.namaChar}")
    println(dtCopy)

    println("--------- ARAH --------")
    val arh = Arah.Atas
    println(arh.showParam())

    println("--------- sealed -----------")
    val hsl: Hasil = Hasil.Sukses("");
    hsl.handleResponse(hsl);

}

