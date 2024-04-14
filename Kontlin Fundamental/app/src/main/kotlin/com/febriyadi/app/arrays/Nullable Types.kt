package com.febriyadi.app.arrays


fun main() {
    val string: String? = "Febriyadi"
    if (string != null) { //Disini compiler mengubah yang tadinya string null menjadi string ini biasa disebut dengan Smart Case
        println(string.length)

    }
    var obj: Any = "Dicoding"
    if(obj is String) {
        // Tidak membutuhkan casting secara eksplisit.
        println("String length is ${obj.length}")
    }
}
