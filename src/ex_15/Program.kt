package ex_15

/*
    Создайте переменную, которая содержит лямбда выражение для вывода в консоль данных массива типа String.
 */
fun main() {
    val months = {arr: Array<String> ->
        for (a in arr) {
            println(a)
        }
    }

    months(arrayOf("Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"))
}