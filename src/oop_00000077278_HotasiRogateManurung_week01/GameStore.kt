package oop_00000077278_HotasiRogateManurung_week01

fun main() {

    val gameTitle = "Minecraft"
    val price = 600000
    val userNote: String? = null

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        note = userNote
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) price * 20 / 100
    else price * 10 / 100

fun printReceipt(title: String, finalPrice: Int, note: String?) {

    val safeNote = note ?: "Tidak ada catatan"

    println("===== GAME STORE RECEIPT =====")
    println("Game   : $title")
    println("Total  : Rp $finalPrice")
    println("Catatan: $safeNote")
    println("=============================")
}
