package oop_00000113470_dherylchristoferyahya.week07


fun processEvent(event: BattleState) {
    when (event) {
        is MonsterEncounter -> {
            println("Waspada! ${event.monsterName} muncul dari semak-semak!")
        }
        is LootDropped -> {
            val item = event.item
            println("Harta Karun! Anda mendapatkan ${item.name} (Rarity: ${item.rarity}, Damage: ${item.damage})")
        }
        is GameOver -> {
            println("Permainan Berakhir. Alasan: ${event.reason}")
        }
        is SafeZone -> {
            println("Anda memasuki zona aman. Waktunya memulihkan HP.")
        }
    }
}