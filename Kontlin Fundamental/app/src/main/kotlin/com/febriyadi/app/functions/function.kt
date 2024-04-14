package com.febriyadi.app.functions

fun setUser(name: String, age: Int): String {
    return "Your name is $name, and you $age years old"
}

fun setUser1(name: String, age: Int): String = "Your name is $name, and you $age years old" //sebaiknya menggunakan ini jika memiliki 1 expresion

fun printUser(name: String): Unit {
    print("Your name is $name")
} // jika fungsi tidak ingin mengembalikan nilai kita bisa menggunakan UNIT

//pemanggilan fungsi secara umum
fun main() {
    val user = setUser("Febriyadi", 19)
    println(user)

    printUser("Febriyadi")
}