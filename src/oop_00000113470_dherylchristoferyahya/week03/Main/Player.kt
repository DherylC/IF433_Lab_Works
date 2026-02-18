package oop_00000113470_dherylchristoferyahya.week03.Main

class Player(val username: String) {
    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount > 0) {
            val oldLevel = level
            xp += amount

            if (level > oldLevel) {
                println("$username leveled up to Level $level")
            }
        }
    }
}