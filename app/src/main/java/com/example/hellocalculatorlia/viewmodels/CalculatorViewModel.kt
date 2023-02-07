package com.example.hellocalculatorlia.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.hellocalculatorlia.data.CalculatorAction


class CalculatorViewModel : ViewModel() {
    var number1 by mutableStateOf("")
        private set
    var number2 by mutableStateOf("")
        private set
    var decimal by mutableStateOf("")
        private set
    var operator by mutableStateOf("")
        private set
    var result by mutableStateOf("")
        private set

    fun onAction(action: CalculatorAction) {
        when (action) {
            is CalculatorAction.Number -> enterNumber(action.number)
            is CalculatorAction.Operation -> enterOperator(action.operator)
            is CalculatorAction.Decimal -> enterDecimal()
            is CalculatorAction.Calculate -> calculate()
            is CalculatorAction.Clear -> clearAll()
        }
    }

    private fun enterNumber(number: Int) {
        if (number.toString().startsWith("0") && (number1.isEmpty() || number2.isEmpty())) return
        else {
            if (operator.isBlank()) {
                number1 += number
                return
            }

            number2 += number
        }
    }

    private fun enterOperator(operator1: String) {
        if (number1.isNotBlank() && operator.isBlank() && !number1.endsWith(".")) {
            operator = operator1
            return
        }
    }

    private fun enterDecimal() {
        if (number1.endsWith(".") || number2.endsWith(".")) return


        else if (operator.isBlank()) {
            if(number1.contains(".")) return
            number1 += "."
        } else {
            if(number2.contains(".")) return
            number2 += "."
        }
    }

    private fun calculate() {
        if (number2.endsWith(".")) return

        val answer: Double = when (operator) {
            "+" -> number1.toDouble() + number2.toDouble()
            "-" -> number1.toDouble() - number2.toDouble()
            "÷" -> number1.toDouble() / number2.toDouble()
            "*" -> number1.toDouble() * number2.toDouble()
            else -> return
        }

        result = answer.toString()
    }


    private fun clearAll() {
        number1 = ""
        number2 = ""
        operator = ""
        decimal = ""
        result = ""
    }


}