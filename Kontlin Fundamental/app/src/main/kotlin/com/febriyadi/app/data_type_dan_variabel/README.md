### Data Types & Variable

#### Apa Itu Tipe Data dan Variabel?

Tipe data adalah klasifikasi atau jenis data yang bisa kita gunakan dalam pemrograman. Kotlin memiliki beberapa tipe data dasar seperti Character, String, Array, Numbers, dan Booleans. Sementara itu, variabel adalah wadah untuk menyimpan data yang bisa diakses atau diubah selama eksekusi program.

#### Struktur Variabel

Sebuah variabel memiliki struktur dasar yang terdiri dari kata kunci (`var` atau `val`), identifier, tipe data, dan inisialisasi. 

- **Kata Kunci (`var` atau `val`)**: 
  - `var`: Memungkinkan untuk mengubah nilai variabel.
  - `val`: Tidak memungkinkan untuk mengubah nilai setelah inisialisasi.

- **Identifier**: Nama variabel yang digunakan untuk mengidentifikasi variabel tersebut dalam kode.

- **Tipe Data**: Jenis data yang akan disimpan di dalam variabel. Kotlin mendukung type inference, yang memungkinkan kita untuk tidak selalu menyebutkan tipe data secara eksplisit.

- **Initialization**: Nilai awal dari variabel.

#### Contoh Variabel

```kotlin
// Variabel dengan kata kunci var
var company: String = "Febriyadi"

// Mengubah nilai variabel
company = "mhmd febriyadi"

// Variabel dengan kata kunci val
val pi: Double = 3.14159

// Variabel tanpa menyebutkan tipe data (Type inference)
var firstWord = "Hello"
var lastWord = "Kotlin"
```

#### Operator dalam Kotlin

- **Matematika**: `+`, `-`, `*`, `/`, `%`
  ```kotlin
  var valueA = 10
  var valueB = 20
  var result = valueA + valueB  // Hasilnya 30
  ```

- **Penugasan**: `=`, `+=`, `-=`, `*=`, `/=`, `%=`
  ```kotlin
  var value = 1
  value += 2  // Nilai sekarang 3
  ```

- **Logika**: `&&`, `||`, `!`
  ```kotlin
  var isKotlinFun = true
  var isJavaFun = false
  var isBothFun = isKotlinFun && isJavaFun  // Hasilnya false
  ```

- **Increment dan Decrement**: `++`, `--`
  ```kotlin
  var counter = 0
  counter++  // Nilai sekarang 1
  ```

#### Catatan

Kotlin memiliki banyak lagi simbol dan operator yang bisa digunakan untuk membangun kode yang lebih kompleks dan efisien. Untuk informasi lebih lanjut, Anda bisa melihat [Keyword di Kotlin](https://kotlinlang.org/docs/keyword-reference.html).

Dengan memahami tipe data dan variabel beserta operasinya, Anda sudah siap untuk memulai perjalanan pemrograman dengan Kotlin!
