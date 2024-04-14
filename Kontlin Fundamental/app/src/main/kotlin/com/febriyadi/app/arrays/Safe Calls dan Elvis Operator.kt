package com.febriyadi.app.arrays

fun main(){
// case Safe call
    val text: String? = null
    text?.length

    //Case Elvis Operator
    val textLength1 = if (text != null) text.length else 7
    val text1: String? = null
    val textLength = text1!!.length
}
