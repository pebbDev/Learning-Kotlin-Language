package com.febriyadi.app.data_type_dan_variabel

fun main() {
    //Conjuction atau AND&&
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = if (now >= officeOpen && now <= officeClosed) {
        true
    } else {
        false
    }

    println("Office is open : $isOpen")

    //Disjunction atau OR (||)
    val isClose = now < officeOpen || now > officeClosed

    println("Office is closed : $isClose")

    //Negation atau NOT (!)
    if (!isOpen) {
        print("Office is closed")
    } else {
        print("Office is open")
    }
}