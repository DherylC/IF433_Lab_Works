package oop_00000113470_dherylchristoferyahya.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("=== TEST REGULAR CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1)
    println("Sama? ${data1 == data2}")

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1
    println("Destructured: $userName berumur $userAge")

    println("=== TEST SEALED CLASS ===")
    val res: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")
    val uiMessage = when(res){
        is ApiResponse.Success -> "tampilkan: ${res.data}"
        is ApiResponse.Error -> "Munculkan alert: ${res.message}"
        ApiResponse.Loading -> "Tampilkan Spinner"
    }
    println(uiMessage)

    println("=== SIMULASI GAME & SINGLETON ===")
    GameManager.startGame()
    GameManager.startGame()

    println("=== DROP RATE ===")
    println("Peluang mendapatkan item LEGENDARY adalah: ${ItemRarity.LEGENDARY.dropChance}%")

    println("=== STARTER WEAPON ===")
    val starterWeapon = Weapon.forgeStarterSword()

    println("Senjata Diterima: ${starterWeapon.item.name}")
    println("Rarity: ${starterWeapon.item.rarity}")
    println("Damage: ${starterWeapon.item.damage}")
    println("Durability Awal: ${starterWeapon.durability}")
}