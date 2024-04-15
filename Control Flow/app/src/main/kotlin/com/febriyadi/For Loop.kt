package com.febriyadi

fun main(){
    val ranges = 1..5
    for (i in ranges){
        println("value is $i!")
    }

    //for loop menggunakan range expression step 3
    val ranges1 = 1.rangeTo(10) step 3
    for (i in ranges1 ){
        println("value is $i!")
    }

    //mengakses index menggunkan withindex
    val ranges3 = 1.rangeTo(10) step 3
    for ((index, value) in ranges3.withIndex()) {
        println("value $value with index $index")
    }

    // menggunakan forEach
    val ranges4 = 1.rangeTo(10) step 3
    ranges4.forEach { value ->
        println("value is $value!")
    }
}