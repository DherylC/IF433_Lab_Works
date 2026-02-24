package oop_00000113470_dherylchristoferyahya.week04

class Main {
    fun main() {
        println("---Testing Vehicle---")
        val generalVehicle = Vehicle(brand = "Sepeda Onthel")
        generalVehicle.honk()
        generalVehicle.accelerate()

        println("\n---Testing Car---")
        val myCar = Car(brand = "Toyota", numberOfDoors = 4)
        myCar.openTrunk()
        myCar.honk()
        myCar.accelerate()

        println("\n---Testing Electric Car (ev)---")
        val ev = ElectricCar(brand = "Mobil Butut tapi bisa di cas", numberOfDoors = 4, batteryCapacity = 19000000)

        ev.accelerate()
        ev.honk()
        ev.openTrunk()

        val manager = Manager("Budi", 10000000)
        println("--- Manager ---")
        manager.work()
        println("Bonus Manager: Rp ${manager.calculateBonus()}")

        val developer = Developer("Andi", 8000000, "C")
        println("--- DATA DEVELOPER ---")
        developer.work()
        println("Bonus Developer: Rp ${developer.calculateBonus()}")
    }
}