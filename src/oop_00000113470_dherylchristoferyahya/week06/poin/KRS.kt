package oop_00000113470_dherylchristoferyahya.week06.poin

class KRS(override val nama: String, override val namaSiswa: String): Mahasiswa, Siswa {
    override fun belajar() {
        println("$nama sedang belajar")
        println("$namaSiswa belajar juga")
    }
    override fun makan() {
        println("$nama makan")
    }
    override fun mandi() {
        println("$namaSiswa mandi")
    }
    override fun mainGame() {
        super<Siswa>.mainGame();
    }

}