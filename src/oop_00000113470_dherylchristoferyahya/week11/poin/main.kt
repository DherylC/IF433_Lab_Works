package oop_00000113470_dherylchristoferyahya.week11.poin

fun String.DasarExtension(): String {
    return "Halo $this"
}

fun String.RubahHurufBesarDepan(): String {
    val hasil = this.split(" ").joinToString(" ") {
        it.replaceFirstChar{
            c -> c.uppercase()
        }
    }
    return hasil
}

fun String.tentukanKelulusan(nilai: Int): String{
    if(nilai >= 70) return this + "lulus" else return this + "ngulang"
}

fun String?.CekNullDanEmpty(): String{
    if(this == null || this.isEmpty()) {
        return "gaboleh null dan kosong"
    } else {
        return this
    }
}

fun main(){
    println("dheryl christofer yahya ijdsa eodj".DasarExtension())

    val nama1 = "Budi"
    println(nama1.uppercase())
    println("budi udin".RubahHurufBesarDepan())

    println("Ha ".repeat(10))
    println("Grade kamu: ".tentukanKelulusan(71))

    val password: String? = null
    println(password.CekNullDanEmpty())
}