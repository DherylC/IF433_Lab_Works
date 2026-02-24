package oop_00000113470_dherylchristoferyahya.LEC

open class Karyawan {
    private var nama:String = "";
    private var gaji:Int = 0;
    protected var namaPacar:String = "";

    public var umur: Int = 0
        set(value) {
            if (value <= 0){
                println("gada umur segitu")
            } else {
                field = value;
            }
        }
        get() {
            return field;
        }

    public fun setName(namakamu:String){
        if(namakamu.length == 0){
            println("nama gaboleh kosong");
        } else if(namakamu.length >= 24){
            println("nama kepanjangan");
        } else {
            this.nama = namakamu;
        }
    }

    public fun getName():String{
        return this.nama;
    }

    public fun setGaji(gajikamu:Int){
        if(gajikamu < 0){
            println("ngakak gaji minus");
        } else {
            this.gaji = gajikamu;
        }
    }

    public fun getGaji():Int{
        return this.gaji;
    }
}

class DataPribadi:Karyawan() {
    public fun setGfData(namapacar: String){
        this.namaPacar = namapacar;
    }
    public fun getGfData():String{
        return this.namaPacar;
    }
}

fun main(){
    val karyawan = Karyawan();
    val dp = DataPribadi();

    karyawan.setName("adam kevin");
    karyawan.setGaji(20000000);

    dp.setGfData("Kevin Adam");
    println("your name: " + karyawan.getName() + "\nyour gaji: Rp" + karyawan.getGaji());
    println("your pacar: " + dp.getGfData())

    dp.umur = 1600;
    println("your umur: " + dp.umur)

}