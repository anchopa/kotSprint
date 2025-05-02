package org.example.lesson3

const val percent = 100.0

fun main() {


    val crystalsWithoutBuff = 7
    val ironWithoutBuff = 11
    val buffPercent = 20.0


    val crystalBonus = (crystalsWithoutBuff * (buffPercent / percent)).toInt()
    val ironBonus = (ironWithoutBuff * (buffPercent / percent)).toInt()

    println("Кристаллическая руда: $crystalBonus")
    println("Железная руда: $ironBonus")

}