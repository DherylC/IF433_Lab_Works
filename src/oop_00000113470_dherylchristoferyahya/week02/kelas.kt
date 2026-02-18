package oop_00000113470_dherylchristoferyahya.week02

class MyCar {
    public var warna = "Abu";
    public var percepatan:Int = 50;
    private var x = 10;
    protected var y = 0;

    init {                              //selalu terpanggil saat class dipanggil
        this.warna = "oyen";

        if(percepatan >= 67){
            println("Percepatan ${percepatan}km/h. Kategori Supercar");
        } else {
            println("Percepatan ${percepatan}km/h. Kategori mobil butut\"");
        }
        println(warna);
    }

    constructor(spd: Int = 120, brake:Int = 20){
        percepatan = spd;
        println("Updated percepatan menjadi $percepatan, dengan brake $brake");
    }

    fun start(){
        println("Mobil $warna mulai jalan");
    }
}

fun main(){
    val myCar = MyCar();
    myCar.start();
    myCar.warna = "Kuning"
    println("Kecepatan ${myCar.warna} sangat kencang");
}