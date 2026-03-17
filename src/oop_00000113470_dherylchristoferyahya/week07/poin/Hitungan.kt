package oop_00000113470_dherylchristoferyahya.week07.poin

class Hitungan private constructor(val type:String) {
    fun showData(){
        println("Param Class ${type}")
    }

    companion object {
        const val NAMAMTK:String = "Matematika"

        fun sum(a: Int, b: Int) {
            println("Penjumlahan $a + $b = ${a + b}");
        }
        fun kali(a: Int, b: Int) {
            println("$a x $b = ${a * b}");
        }

        fun buat_data(type: String) {
            Hitungan(type)
        }
    }
}