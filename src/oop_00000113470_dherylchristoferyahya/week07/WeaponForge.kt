package oop_00000113470_dherylchristoferyahya.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {

    companion object {
        fun forgeStarterSword(): Weapon {
            val starterItem = GameItem(
                name = "Pedang bahlil",
                damage = 5,
                rarity = ItemRarity.COMMON
            )
            return Weapon(starterItem, 50)
        }

        fun forgeEpicSword(): Weapon {
            val epicItem = GameItem(
                name = "Etanol",
                damage = 999,
                rarity = ItemRarity.EPIC
            )
            return Weapon(epicItem, 200)
        }
    }
}