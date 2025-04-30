package org.example.lesson3

fun main() {

    val member: Byte = 50
    var zp = 30000

    val membersNew: Byte = 30
    var zpNew = 20000

    val expenses_for_memb = zp * member

    val expenses_after_newMemb = (zp*member) + (zpNew * membersNew)

    val sr_zp_memb = expenses_after_newMemb / 80

    println(expenses_for_memb)
    println(expenses_after_newMemb)
    println(sr_zp_memb)
    //я снова перепутал названия веток не ругайтесь пожалуйста
}