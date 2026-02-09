package oop_00000077278_HotasiRogateManurung_week01

fun main() {

    val gameTitle = "Minecraft"
    val price = 600000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    println("Game: $gameTitle")
    println("Price: Rp $price")
    println("Discount: Rp $discount")
    println("Final Price: Rp $finalPrice")
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) (price * 20) / 100
    else (price * 10) / 100
