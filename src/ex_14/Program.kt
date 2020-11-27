package ex_14

import java.text.FieldPosition

/*
    Напишите функцию, которая выводит в консоль информацию сотрудника (ФИО, Возраст, Должность и Семейное положение).
    С помощью перезагрузки функции, сделайте варианты, когда известны только:

    - ФИО и Должность
    - ФИО, Возраст и Должность
    - ФИО, Семейное положение и Должность
    - ФИО, Возраст, Семейное положение и Должность
 */
fun main() {
    print("Введите ФИО: ")
    val fullName: String = readLine().toString()
    print("Введите возраст (цифры): ")
    val age: String = readLine().toString()
    print("Введите должность: ")
    val position: String = readLine().toString()
    print("Введите семейное положение: ")
    val maritalStatus: String = readLine().toString()

    if (age == "" && maritalStatus == "") {
        printInfo(fullName, position)
    } else if (maritalStatus == "") {
        printInfo(fullName, age.toShort(), position)
    } else if (age == "") {
        printInfo(fullName, maritalStatus, position)
    } else {
        printInfo(fullName, age.toShort(), maritalStatus, position)
    }
}

private fun printInfo(fullName: String, position: String) {
    println("ФИО: $fullName")
    println("Должность: $position")
}

private fun printInfo(fullName: String, age: Short, position: String) {
    println("ФИО: $fullName")
    println("Возраст: $age")
    println("Должность: $position")
}

private fun printInfo(fullName: String, maritalStatus: String, position: String) {
    println("ФИО: $fullName")
    println("Семейное положение: $maritalStatus")
    println("Должность: $position")
}

private fun printInfo(fullName: String, age: Short, maritalStatus: String, position: String) {
    println("ФИО: $fullName")
    println("Возраст: $age")
    println("Семейное положение: $maritalStatus")
    println("Должность: $position")
}