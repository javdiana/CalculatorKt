package com.javdiana.calculatorkt

data class Numb(var num1: Float, var num2: Float, var operation: Char, var result: Float) {
    constructor() : this(0f, 0f, '1', 0f) {

    }
}