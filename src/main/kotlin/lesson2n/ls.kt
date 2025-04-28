package org.example.lesson2n

fun main() {

    val seconds = 6480

    val hour = seconds / 3600

    val ostatokSeconds = seconds % 3600

    val minutes = ostatokSeconds / 60

    val secAfterMin = ostatokSeconds % 60


    println("${"%02d:%02d:%02d".format(hour, minutes, seconds)}")
}