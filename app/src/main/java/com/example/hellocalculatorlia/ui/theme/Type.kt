package com.example.hellocalculatorlia.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.hellocalculatorlia.R

// Set of Material typography styles to start with
val ComicSans = FontFamily(
    Font(R.font.comicneue_bold)
)



val Typography = Typography(
    h1 = TextStyle(
        fontFamily = ComicSans,
        fontWeight = FontWeight.Normal,
        fontSize = 250.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp,
        color = HotPink
    ),

    h2 = TextStyle(
        fontFamily = ComicSans,
        fontWeight = FontWeight.Normal,
        fontSize = 100.sp,
        color = LimeGreen

        ),
    h3 = TextStyle(
        fontFamily = ComicSans,
        fontWeight = FontWeight.Normal,
        fontSize = 30.sp,
        color = LimeGreen
    ) ,

    caption = TextStyle(
        fontFamily = ComicSans,
        fontWeight = FontWeight.Normal,
        fontSize = 50.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp,
        color = HotPink
    )


)