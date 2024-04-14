package com.febriyadi.app.functions
fun main() {
    val fullName = getFullName2(first = "Kotlin" , middle = " is ", last = "Awesome")
    print(fullName)

    // mengubah posis
    val fullName2 = getFullName2(middle = " is " , first = "Kotlin", last = "Awesome")
    print(fullName)
    print(fullName2)

    // Tanpa menuliskan argument
    val fullName3 = getFullName()
    print(fullName3)

}
//menambahkan value agar tidak perlu menuliskan argument di functionnya
fun getFullName(
    first: String = "Kotlin",
    middle: String = " is ",
    last: String = "Awesome"): String {
    return "$first $middle $last"
}
fun getFullName2(first: String, middle: String, last: String): String {
    return "$first $middle $last"

}