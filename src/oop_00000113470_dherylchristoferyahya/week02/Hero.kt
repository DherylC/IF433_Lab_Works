package oop_00000113470_dherylchristoferyahya.week02
import java.util.Scanner

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
) {
    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) {
            hp = 0
        }
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- Setup Hero ---")
    print("Masukkan nama Hero: ")
    val heroName = scanner.nextLine()
    print("Masukkan Base Damage: ")
    val damageValue = scanner.nextInt()

    val myHero = Hero(heroName, damageValue)
    var enemyHp = 100

    println("\n=== ${myHero.name} vs LilLilPakBahlil ===")

    while (myHero.isAlive() && enemyHp > 0) {
        println("\n--- Status ---")
        println("${myHero.name} HP: ${myHero.hp} | Enemy HP: $enemyHp")
        println("Menu:\n1. Serang\n2. Kabur")
        print("Action: ")

        when (scanner.nextInt()) {
            1 -> {
                myHero.attack("Slime")
                enemyHp -= myHero.baseDamage
                if (enemyHp < 0) enemyHp = 0
                println("HP musuh sisa: $enemyHp")

                if (enemyHp > 0) {
                    val enemyDamage = (10..20).random()
                    println("Slime menyerang balik!")
                    myHero.takeDamage(enemyDamage)
                    println("HP ${myHero.name} sisa: ${myHero.hp}")
                }
            }
            2 -> {
                println("${myHero.name} melarikan diri dari pertempuran!")
                break
            }
            else -> println("Pilihan tidak valid!")
        }
    }

    println("\nBattle Over")
    if (myHero.isAlive() && enemyHp <= 0) {
        println("Selamat! ${myHero.name} memenangkan pertarungan!")
    } else if (!myHero.isAlive()) {
        println("${myHero.name} telah gugur. Game Over.")
    } else {
        println("Pertarungan berakhir tanpa pemenang.")
    }
}