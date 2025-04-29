package org.example.lesson2n

    const val SECONDS_IN_HOUR = 3600
    const val SECONDS_IN_MINUTE = 60
    const val SECONDS_TOTAL = 6480


fun main() {


    val seconds = SECONDS_TOTAL
    val hour = seconds / SECONDS_IN_HOUR
    val remainingSeconds = seconds % SECONDS_IN_HOUR
    val minutes = remainingSeconds / SECONDS_IN_MINUTE
    val secAfterMin = remainingSeconds % SECONDS_IN_MINUTE

    println("%02d:%02d:%02d".format(hour, minutes, secAfterMin))
}