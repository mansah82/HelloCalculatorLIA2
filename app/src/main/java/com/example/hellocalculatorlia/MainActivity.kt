package com.example.hellocalculatorlia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.hellocalculatorlia.ui.theme.HelloCalculatorLIATheme
import com.example.hellocalculatorlia.viewmodels.CalculatorViewModel



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val viewModel = CalculatorViewModel()

            HelloCalculatorLIATheme {
                MyCalculator(
                    number1 = viewModel.number1,
                    number2 = viewModel.number2,
                    operator = viewModel.operator,
                    result = viewModel.result,
                    onAction = viewModel::onAction
                )
            }
        }
    }
}




