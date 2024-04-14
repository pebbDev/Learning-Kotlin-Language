package com.febriyadi.app.functions

//Kapan menggunakan Vararg arguments ketika function tidak mengetahui jumlah argument
//Dalam vararg tidak diizinkan memiliki 2 argument contoh : fun sumNumbers(vararg number: Int, vararg number2: Int)
fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}
fun getNumberSize(vararg number: Int): Int {
    return number.size
}
fun sets(vararg number: Int): Int {
    return 0
}

fun main() {
    val number = sumNumbers(10, 20, 30, 40)
    println(number)
    val size = getNumberSize(10,20,30,40,50,190)
    print(size)

    //vararg vs array
    val number1 = intArrayOf(10, 20, 30, 40)
    sets(10, 20, 20, *number1 , 10)
}

