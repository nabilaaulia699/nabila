package `1`

fun main (){
    //operator aritmatika
    val plus = 5 + 5
    val minus = 5 - 5
    val kali = 5 * 5
    val bagi = 5 / 5
    val modulus = 5 % 5

    println(plus)
    println(minus)
    println(kali)
    println(bagi)
    println(modulus)

    //operator perbandingan
    val a = 10
    val b = 5

    val lebihdari = a > b
    val kurangdari = a < b
    val lebihdarisamadengan = a >= b
    val kurangdarisamadengan = a <= b
    val samadengan = a == b
    val tidaksamadengan = a != b

    println(lebihdari)

    //operator logika
    //and = dua statment harus true (konjungsi)
    val and = 10 > 9 && 12 > 11
    println(and)

    //or = salah satu statment harus true (disjungsi)
    val or = 10 > 10 || 12 > 11
    println(or)

    //negasi (kebalikan)
    val negasi = !true
    println(negasi)
}