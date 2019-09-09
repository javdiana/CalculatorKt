package com.javdiana.calculatorkt

fun calculate(numb: Numb?): Float {
    when (numb?.operation ?: return 0f) {
        '+' -> numb.result = numb.num1 + numb.num2
        '-' -> numb.result = numb.num1 - numb.num2
        '*' -> numb.result = numb.num1 * numb.num2
        '/' -> numb.result = numb.num1 / numb.num2
    }
    return numb.result
}