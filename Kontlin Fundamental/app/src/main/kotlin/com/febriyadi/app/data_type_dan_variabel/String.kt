package com.febriyadi.app.data_type_dan_variabel

fun main (){
    //String Memanfaatkan indexing
    val name = "febriyadi";
    val firsChart = name[3];

    println("Berikut huruf ke 3 dari nama saya $firsChart")

    //iterasi terhadap object menggunakan for loop
    val text = "Kotlin";
    for (char in text){
        println("$char")
    }

    //escape string
    val person = "nama saya \"mhmd febriyadi !\""
    /*
    \t = menambah teks dalam teks
    \N = membuat baris dalam teks
    \' = menambahkan krakter singgle quote ke dalam teks
    \" = menambahkan krakter backslash kedalam teks
     */
    //raw String
    val line = """
        Line 1 
        Line 2
        Line 3
    """.trimIndent()
    println(line)

    //unicode
    val brand = "pewDev\u00A9"
    println(brand)
}