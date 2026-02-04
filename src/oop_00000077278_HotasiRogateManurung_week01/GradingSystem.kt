package oop_00000077278_HotasiRogateManurung_week01

fun main() {
    var name: String = "John Thor"
    var Score: Int = 80

    println("Nama: $name, Nilai: $Score")

    val grade = when (Score) {
        in 90 .. 100 ->"A"
        in 80 .. 89 ->"B"
        in 70 .. 79 ->"C"
        else -> "D"
    }

    println("Grade kamu: $grade")
}

