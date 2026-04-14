package oop_00000113470_dherylchristoferyahya.week08.kelas

class profilePage(val idprofile: String?, val statusOnline: String?) {
    fun ganti_foto(filePhoto: String?){
        println("Foto anda: $filePhoto")
    }
}

fun main() {
    var nama: String? = "Dheryl"
    nama = null
    println("Nama anda: $nama")

    val profile = profilePage("122", null)
    println("Profile ID: ${profile.idprofile}, online: ${profile.statusOnline}")

    profile.ganti_foto("foto.jpg")
}