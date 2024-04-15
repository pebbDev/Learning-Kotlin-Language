# Control Flow dalam Kotlin

Control flow merupakan alur eksekusi dari program yang memungkinkan kita mengontrol bagaimana kode dijalankan berdasarkan kondisi tertentu. Dengan menggunakan kontrol alur ini, kita dapat membuat logika dan kondisi untuk menentukan jalannya eksekusi program.

## Apa itu Control Flow?

Control flow adalah cara kita mengontrol alur dari sebuah program berdasarkan kondisi saat program tersebut berjalan. Ini memungkinkan kita untuk membuat logika, melakukan iterasi, dan membuat keputusan dalam kode kita.

### Komponen Control Flow

Berikut adalah beberapa komponen utama dari control flow yang akan kita bahas:

### 1. When Expression

`when` adalah ekspresi yang digunakan untuk mengevaluasi suatu ekspresi dan menjalankan kode berdasarkan nilai dari ekspresi tersebut.

**Contoh:**
```kotlin
val x = 5

when (x) {
    1 -> println("x adalah 1")
    2 -> println("x adalah 2")
    else -> println("x tidak ada dalam 1 atau 2")
}
```

### 2. Expression & Statement

Dalam Kotlin, hampir semua hal adalah ekspresi yang menghasilkan nilai. Sebuah statement adalah baris kode yang menjalankan tugas tertentu tanpa menghasilkan nilai.

**Contoh:**
```kotlin
// Ekspresi
val max = if (a > b) a else b

// Statement
println("Hello, World!")
```

### 3. While and Do While

`while` dan `do while` adalah perulangan yang digunakan untuk menjalankan blok kode berulang kali selama kondisi tertentu terpenuhi.

**Contoh:**
```kotlin
var i = 0
while (i < 5) {
    println(i)
    i++
}

var j = 0
do {
    println(j)
    j++
} while (j < 5)
```

### 4. Range and For Loop

Kotlin mendukung range yang memudahkan kita untuk melakukan iterasi melalui serangkaian angka atau karakter.

**Contoh:**
```kotlin
for (i in 1..5) {
    println(i)
}
```

### 5. Break and Continue Labels

`break` digunakan untuk menghentikan loop, sedangkan `continue` digunakan untuk melanjutkan ke iterasi berikutnya dalam loop.

**Contoh:**
```kotlin
loop@ for (i in 1..5) {
    for (j in 1..5) {
        if (j == 3) {
            break@loop
        }
        println("$i, $j")
    }
}
```
