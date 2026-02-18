package oop_00000113470_dherylchristoferyahya.week03.Main

fun main() {
    val myWeapon = Weapon("Pedang-kalan sungai")

    println("--- Testing Weapon Assignment ---")

    myWeapon.damage = -50
    myWeapon.damage = 9999

    println("Weapon: ${myWeapon.name}")
    println("Damage: ${myWeapon.damage}")
    println("Tier: ${myWeapon.tier}")
}