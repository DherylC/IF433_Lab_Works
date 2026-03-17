package oop_00000113470_dherylchristoferyahya.week07.poin

sealed class Hasil {
    data class Sukses(val data:String):Hasil()
    data class Error(val ex: Exception):Hasil()
    object loading:Hasil()

    fun handleResponse(res:Hasil){
        when(res){
            is Sukses -> {println("Sukses lempar data")}
            is Error -> {println("Error ${res.ex}")}
            loading -> {println("loading")}
        }
    }
}