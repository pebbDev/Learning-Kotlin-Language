package com.febriyadi

import kotlin.random.Random

fun main (){
    val value = 7

    when(value){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
    }

    val value1 = 20

    when(value1){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("value cannot be reached")
    }

    // contoh when expression mengembalikan nilai
    val value3 = 7
    val stringOfValue = when (value3) {
        6 -> "value is 6"
        7 -> "value is 7"
        8 -> "value is 8"
        else -> "value cannot be reached"
    }

    println(stringOfValue)

    //when menggunakan is atau !is
    val anyType : Any = 100L
    when(anyType) {
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }

    //memeriksa range dan collection
    val value4 =  27
    val ranges = 10..50

    when(value4){
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
    }

    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }
    println(registerNumber)

    val anyType1: Any = 100L
    when (anyType1) {
        is Long -> println("the value has a Long type")
        is Int -> println("the value has a Int type")
        is Double -> println("the value has a Double type")
        else -> println("undefined")
    }
}
fun getRegisterNumber() = Random.nextInt(100)