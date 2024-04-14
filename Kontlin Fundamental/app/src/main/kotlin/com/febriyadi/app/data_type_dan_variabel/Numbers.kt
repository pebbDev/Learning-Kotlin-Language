package com.febriyadi.app.data_type_dan_variabel

fun main() {
    /*
    Tipe data yang merepresentasikan numbers Int, Double, Long, Short, Float dan Byte
     */

    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE
    println(minInt)
    println(maxInt)

    val maxInt1 = Int.MAX_VALUE
    val overRangeInt1 = Int.MAX_VALUE + 1 // This operation has led to an overflow

    println("Max Int: $maxInt1")
    println("Over range Int: $overRangeInt1")

    /*
    Konversi yang dapat dilakukan :
        toByte(): Byte
        toShort(): Short
        toInt(): Int
        toLong(): Long
        toFloat(): Float
        toDouble(): Double
        toChar(): Char
     */
}