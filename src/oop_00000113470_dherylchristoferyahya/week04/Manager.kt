package oop_00000113470_dherylchristoferyahya.week04

class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {

    override fun work() {
        println("$name is working.")
    }

    override fun calculateBonus(): Int {
        val standardBonus = super.calculateBonus()
        return standardBonus + 500000
    }
}