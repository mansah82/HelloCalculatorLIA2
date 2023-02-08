package com.example.hellocalculatorlia.data

sealed class CalculatorAction {
    data class Number(val number: Int) : CalculatorAction()
    data class Operation(val operator: String) : CalculatorAction()
    object Decimal : CalculatorAction()
    object Clear : CalculatorAction()
    object Calculate : CalculatorAction()
}
