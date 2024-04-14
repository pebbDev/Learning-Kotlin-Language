package com.febriyadi.app.arrays

//Array dikotlin dapat dimasukan berbagai tipe data yang berbeda
val mixArray = arrayOf(1, 2, 3, 4, 5, "febriyadi", false)
/*
intArrayOf() : IntArray
booleanArrayOf() : BooleanArray
charArrayOf() : CharArray
longArrayOf() : LongArray
shortArrayOf() : ShortArray
byteArrayOf() : ByteArray
 */

//Jika kita hanya ingin menggunakan array dalam bentuk tipe data Int berikut : intArrayOf(),
val intArray = intArrayOf(1, 3, 5, 7)


fun main() {
    // Mendapatkan nilai dari index
    val intArray1 = intArrayOf(1, 3, 5, 7)
    println(intArray1[2])

    //Menambahkan index
    val intArray = intArrayOf(1, 3, 5, 7)  // [1, 3, 5, 7]
    intArray[2] = 11                       // [1, 3, 11, 7]

    print(intArray[2])
}