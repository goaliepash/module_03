package ex_12

/*
    Напишите функцию, которая получает в параметры какой-либо год, проверяет високосный ли это год и возвращает
    результат проверки.
 */

fun main() {

    print("Введите год: ")
    val year: Int = readLine()!!.toInt()
    if (leapYear(year)) {
        println("Год $year является високосным.")
    } else {
        println("Год $year не является високосным.")
    }
}

private fun leapYear(year: Int): Boolean {
    if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
        return true
    }
    return false
}