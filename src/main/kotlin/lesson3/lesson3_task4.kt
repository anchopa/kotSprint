package org.example.lesson3

fun main() {

    val crystalsWithoutBuff = 7
    val ironWithoutBuff = 11
    val buff = 0.2

    val crystalBonus = (crystalsWithoutBuff * buff).toInt()
    val ironBonus = (ironWithoutBuff * buff).toInt()

    println("Кристаллическая руда: $crystalBonus")
    println("Железная руда: $ironBonus")
}