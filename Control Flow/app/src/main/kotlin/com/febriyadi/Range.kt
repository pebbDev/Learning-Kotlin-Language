package com.febriyadi

fun main() {
    // range dengan operator [..]
    val rangeInt = 1..10
    println(rangeInt.step)


//Range dengan step 2
    val rangeInt2 = 1..10 step 2
    rangeInt.forEach {
        print("$it ")
    }
    println(rangeInt2.step)

    //range dengan fungsi rangeTo
    val rangeInt4 = 1.rangeTo(10)
    rangeInt4.forEach {
        print("$it")
    }

    //range dengan fungsi downTo
    val tenToOne = 10.downTo(1)
    if (7 in tenToOne) {
        println("Value 7 available")
    }
}