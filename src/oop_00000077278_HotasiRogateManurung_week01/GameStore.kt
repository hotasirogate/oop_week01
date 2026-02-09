package oop_00000077278_HotasiRogateManurung_week01

fun main() {

    val gameTitle = "Minecraft"
    val price = 600000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(title = gameTitle, finalPrice = finalPrice)
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) price * 20 / 100
    else price * 10 / 100

fun printReceipt(title: String, finalPrice: Int) {
    println("===== GAME STORE RECEIPT =====")
    println("Game  : $title")
    println("Total : Rp $finalPrice")
    println("=============================")
}