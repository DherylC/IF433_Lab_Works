package oop_00000113470_dherylchristoferyahya.week12.poin

fun pembagian(){
    var a: Int = 10
    var b: Int = 10
    try {
        val hasil = a/b
        println("hasil bagi: $hasil")
    } catch (e:Exception){
        println("Ada Eror: ${e.message}")
    } finally {
        println("selesai try catch")
    }
}

fun cekTipeVariabel(){
    var angka:Int = try{
        Integer.parseInt("123")
    } catch (e: Exception) {
        println("ada eror: ${e.message}")
        777
    }

    println(angka)
}

fun cekNilai(nilai: Int){
    if(nilai < 0){
        throw IllegalArgumentException("masa nilai minus")
    } else if(nilai > 100) {
        throw IllegalArgumentException("masa nilai lebih dari 100")
    } else {
        println("nilainya $nilai")
    }
}

class cekSaldo(val pengeluaran: Int, val saldo: Int): Exception("Saldo kamu sisa ${saldo-pengeluaran}, pengeluaran $pengeluaran"){}

class transaksi(val totalBelanja: Int){
    fun tarikUang(bal: Int){
        if(totalBelanja > bal){
            throw cekSaldo(totalBelanja, bal)
        } else {
            println("Transaksi Berhasil, sisa saldo ${bal - totalBelanja}.")
        }
    }
}

fun multipleCatch(input: String){
    try{
        val angka: Int = input.toInt()
        val hitungBagi: Int = angka/0
        println("hasil bagi: $hitungBagi")
    } catch(e: NumberFormatException){
        println("gabisa bagi huruf. ${e.message}")
    } catch (e: ArithmeticException){
        println("gabisa bagi nol. ${e.message}")
    } catch (e: Exception) {
        println("ada error tapi gatau. ${e.message}")
    }
}

sealed class BankException(msg: String): Exception("error di bank exception $msg")

class cekSaldoBank(val pengeluaran: Int, val jajan: Int): BankException("Pengeluaran $pengeluaran lebih besar dari saldo")
class cekInput(val transaksi: Int): BankException("transaksi masa minus $transaksi")

fun transaksiBelanja(jajan: Int, duit: Int) {
    if(jajan < 0 ){
        throw cekInput(jajan)
    } else if (duit < jajan){
        throw cekSaldo(duit, jajan)
    }
}

fun main(){
    pembagian()
    cekTipeVariabel()
    try {
        cekNilai(-10)
    } catch (e:Exception){
        println("Ada Eror di nilai: ${e.message}")
    }

    val trx = transaksi(4000)
    trx.tarikUang(20000)

    multipleCatch("abc")
    multipleCatch("999")

    runCatching { transaksiBelanja(20000, 9000) }
        .onSuccess { println("Belanja sukses, sisa saldo $it") }
        .onFailure { println("$it") }
}