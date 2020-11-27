package ex_16

import kotlin.math.sqrt

/*
    Напишите функцию для переменных типа Double, возвращающую корень числа.
 */
fun main() {
    val a: Double = readLine()!!.toDouble()
    println(root(a, fun(arg: Double): Double { return sqrt(arg) }))
}

private fun root(a: Double, op: (Double) -> Double): Double {
    return op(a)
}