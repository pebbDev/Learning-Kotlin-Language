package com.febriyadi.app.functions

/*
Visibility Modifier
Public (Default)
Hak akses ini bisa diakses dari mana saja, baik itu di dalam kelas itu sendiri, di kelas lain dalam paket yang sama, maupun di kelas lain di luar paket.
 */
fun showInfo() {
    println("This is public function.")
}
/*
Private
Hanya bisa diakses di dalam kelas yang sama.
 */
private fun privateFunction() {
    println("This is private function.")
}

/*
Protected
Dapat diakses di dalam kelas yang sama dan juga kelas turunannya (subkelas), baik itu di paket yang sama atau di paket yang berbeda.
Namun, perlu diingat bahwa dalam Kotlin, hak akses protected hanya berlaku untuk kelas dan properti, tidak berlaku untuk fungsi.
 */
protected val protectedProperty: String = "Protected Property"

/*
Internal

Dapat diakses di dalam modul yang sama (sebuah unit kompilasi di Kotlin).
Ini memungkinkan untuk membuat sesuatu yang dapat diakses hanya di dalam satu modul tertentu tanpa memperhatikan paket atau kelas tertentu.
 */
internal fun internalFunction() {
    println("This is internal function.")
}

