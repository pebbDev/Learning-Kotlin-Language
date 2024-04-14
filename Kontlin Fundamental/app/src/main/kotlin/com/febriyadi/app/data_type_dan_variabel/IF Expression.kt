package com.febriyadi.app.data_type_dan_variabel

fun main() {
    //if expression
//    val openHours = 7
//    val closeHours = 10
//    if (openHours > closeHours) {
//        println("Hours close")
//    }

    //Menyimpan hasil disebuah variabel
    val openHours1 = 7
    val now = 20
    val office: String
    if (now > openHours1) {
        office = "Office already open"
    } else {
        office = "Office is closed"
    }

    println(office)


    val openHours3 = 7
    val now3 = 7
    val office3: String
    office3 = if (now3 > 7) {
        "Office already open"
    } else if (now3 == openHours3) {
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    print(office3)
}