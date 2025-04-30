package org.example.lesson3

fun main() {

    val crystalsWithoutBuff = 7
    val ironWithoutBuff = 11


    val crystalBonus = (crystalsWithoutBuff * 0.2).toInt()
    val ironBonus = (ironWithoutBuff * 0.2).toInt()


    println("Кристаллическая руда: $crystalBonus")
    println("Железная руда: $ironBonus")
}