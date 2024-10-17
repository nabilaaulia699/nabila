package `1`

fun main(){

    val tugas = 80
    val uts = 80
    val uas = 80
    val average = (tugas + uts + uas) / 3

    val grade = when (average){
        in 75..100 -> 'A'
        in 65..74 -> 'B'
        in 55..64 -> 'C'
        in 45..54 -> 'D'
        else -> 'E'
    }
    val status = if (grade in 'A'..'C') "Lulus" else "Tidak lulus"

    println("nilai rata-rata: $average")
    println("grade: $grade")

}