package com.example.hellocalculatorlia

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import com.example.hellocalculatorlia.data.CalculatorAction
import com.example.hellocalculatorlia.data.listOfNumberAndOperators

@Composable
fun MyCalculator(
    number1: String,
    number2: String,
    operator: String,
    result: String,
    onAction: (CalculatorAction) -> Unit
) {

    Column {

        LazyColumn(

            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
                .background(MaterialTheme.colors.secondary),


            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(items = listOfNumberAndOperators, itemContent = { operatorOrNumber ->

                when (operatorOrNumber) {

                    "Nightmareulator" -> {
                        Text(text = operatorOrNumber, style = MaterialTheme.typography.caption)
                    }

                    "." -> {
                        ClickableText(
                            text = AnnotatedString(operatorOrNumber),
                            style = MaterialTheme.typography.h1,
                            onClick = { onAction(CalculatorAction.Decimal) })
                    }


                    "+" -> {
                        ClickableText(
                            text = AnnotatedString(operatorOrNumber),
                            style = MaterialTheme.typography.h1,
                            onClick = { onAction(CalculatorAction.Operation("+")) })


                    }

                    "-" -> {
                        ClickableText(
                            text = AnnotatedString(operatorOrNumber),
                            style = MaterialTheme.typography.h1,
                            onClick = { onAction(CalculatorAction.Operation("-")) })


                    }

                    "÷" -> {
                        ClickableText(
                            text = AnnotatedString(operatorOrNumber),
                            style = MaterialTheme.typography.h1,
                            onClick = { onAction(CalculatorAction.Operation("÷")) })


                    }
                    "*" -> {
                        ClickableText(
                            text = AnnotatedString(operatorOrNumber),
                            style = MaterialTheme.typography.h1,
                            onClick = { onAction(CalculatorAction.Operation("*")) })


                    }


                    "=" -> {
                        ClickableText(
                            text = AnnotatedString(operatorOrNumber),
                            style = MaterialTheme.typography.h1,
                            onClick = { onAction(CalculatorAction.Calculate) })


                    }

                    "AC" -> {
                        ClickableText(
                            text = AnnotatedString(operatorOrNumber),
                            style = MaterialTheme.typography.h1,
                            onClick = { onAction(CalculatorAction.Clear) })

                    }


                    else -> {
                        ClickableText(
                            text = AnnotatedString(operatorOrNumber),
                            style = MaterialTheme.typography.h1,
                            onClick = { onAction(CalculatorAction.Number(operatorOrNumber.toInt())) }
                        )


                    }
                }
            })
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
                .background(MaterialTheme.colors.primary)
        ) {

            Text(
                text = number1 + operator + number2,
                style = MaterialTheme.typography.h3,
                modifier = Modifier
                    .align(Alignment.End)
                    .padding(10.dp)
            )

            Text(
                text = result, style = MaterialTheme.typography.h2,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(15.dp),

                )


        }
    }
}