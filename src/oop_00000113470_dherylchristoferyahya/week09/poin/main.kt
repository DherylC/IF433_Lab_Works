package oop_00000113470_dherylchristoferyahya.week09.poin

fun main() {
    println("=== LISTOF ===")
    val arMhs  = listOf("Budi", "Susi", "Titus")
    println(arMhs)
    println("panjang list: ${arMhs.size}")

    println(arMhs[1])

    for(a in arMhs) {
        println(a)
    }

    println("\n=== ARRAY ===")
    val arAngka = mutableListOf(10, 20, 30)
    arAngka.add(75)
    arAngka[2] = 123
    arAngka.removeAt(0)
    println(arAngka)

    println("\n=== SET ===")
    val arUrutan = setOf(10, 20, 30, 60, 40, 50, 50)
    println(arUrutan.size)
    println(arUrutan)
    println("Angka 40 ada ga? ${arUrutan.contains(40)}")

    println("\n=== MUTABLE SET ===")
    val arMakanan = mutableSetOf("nasi", "bakpao", "mie", "ayam")
    arMakanan.add("nasi")
    arMakanan.add("bakmie")
    arMakanan.remove("bakpao")
    println(arMakanan)
}