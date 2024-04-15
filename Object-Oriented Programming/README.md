## Object-Oriented Programming (OOP) dengan Kotlin

Kotlin memberikan dukungan yang luas untuk mengembangkan program berorientasi objek. OOP adalah paradigma pemrograman yang populer karena memungkinkan kita memvisualisasikan kode dengan cara yang mirip dengan skenario dalam kehidupan nyata.

### Konsep Dasar OOP

**Class, Atribut, dan Behaviour**
- **Class**: Blueprint untuk membuat objek.
- **Atribut**: Komponen atau data yang dimiliki oleh objek.
- **Behaviour**: Kemampuan atau fungsi yang dapat dilakukan oleh objek.

#### Contoh: Blueprint Mobil
```kotlin
class Mobil {
    var warna: String = ""
    var merek: String = ""
    
    fun maju() {
        println("Mobil bergerak maju.")
    }
}
```

#### Contoh: Blueprint Kucing
```kotlin
class Kucing {
    var warna: String = ""
    var jenis: String = ""
    
    fun meong() {
        println("Kucing $jenis meong.")
    }
}
```

### 4 Pilar OOP

1. **Inheritance**: Konsep pewarisan antar objek.
2. **Encapsulation**: Mengumpulkan data dan metode dalam satu objek.
3. **Abstraction**: Menyembunyikan detail implementasi.
4. **Polymorphism**: Kemampuan objek dengan tipe berbeda untuk diproses dengan cara yang serupa.

#### Contoh: Pewarisan (Inheritance)
```kotlin
open class Hewan {
    fun makan() {
        println("Hewan sedang makan.")
    }
}

class Kucing: Hewan() {
    fun tidur() {
        println("Kucing sedang tidur.")
    }
}
```

#### Contoh: Encapsulation
```kotlin
class Orang {
    private var umur: Int = 0
    
    fun setUmur(newUmur: Int) {
        if (newUmur >= 0) {
            umur = newUmur
        }
    }
    
    fun getUmur(): Int {
        return umur
    }
}
```

#### Contoh: Abstraction dan Polymorphism
```kotlin
abstract class Bentuk {
    abstract fun luas(): Double
}

class Lingkaran(val radius: Double): Bentuk() {
    override fun luas(): Double {
        return Math.PI * radius * radius
    }
}
```

### Selanjutnya

Pada modul berikutnya, kita akan mempelajari object, class, attribute, dan behaviour lebih detail. Selain itu, kita juga akan belajar penerapan masing-masing pilar OOP dengan contoh yang lebih mendalam. Yuk, terus pelajari bersama!

---
