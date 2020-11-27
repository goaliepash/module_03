package ex_13

/*
    Напишите функцию, принимающую на вход имена сотрудников и возвращающую их количество. Используйте для этого vararg,
    из предыдущей темы.
 */

fun main() {
    val employees = arrayOf("Иванов Павел", "Гимадиев Эдуард", "Чернов Александр", "Доманова Ольга")
    print("Количество сотрудников в компании: ${numberOfEmployees(*employees)}")
}

private fun numberOfEmployees(vararg employees: String): Int {
    return employees.size
}