@file:OptIn(ExperimentalTextApi::class, ExperimentalTextApi::class, ExperimentalTextApi::class)

package com.junkfood.seal.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineBreak
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.unit.sp

val Typography =
    Typography().run {
        copy(
            displayLarge = displayLarge.applyTextDirection().copy(letterSpacing = (-0.2).sp),
            displayMedium = displayMedium.applyTextDirection().copy(letterSpacing = (-0.1).sp),
            displaySmall = displaySmall.applyTextDirection().copy(letterSpacing = 0.sp),
            headlineLarge = headlineLarge.applyTextDirection(),
            headlineMedium = headlineMedium.applyTextDirection(),
            headlineSmall = headlineSmall.applyTextDirection(),
            titleLarge = titleLarge.applyTextDirection().copy(fontWeight = FontWeight.SemiBold),
            titleMedium = titleMedium.applyTextDirection().copy(fontWeight = FontWeight.Medium),
            titleSmall = titleSmall.applyTextDirection().copy(fontWeight = FontWeight.Medium),
            bodyLarge = bodyLarge.applyLinebreak().applyTextDirection(),
            bodyMedium = bodyMedium.applyLinebreak().applyTextDirection(),
            bodySmall = bodySmall.applyLinebreak().applyTextDirection(),
            labelLarge = labelLarge.applyTextDirection().copy(fontWeight = FontWeight.SemiBold),
            labelMedium = labelMedium.applyTextDirection().copy(fontWeight = FontWeight.Medium),
            labelSmall = labelSmall.applyTextDirection().copy(fontWeight = FontWeight.Medium),
        )
    }

private fun TextStyle.applyLinebreak(): TextStyle = this.copy(lineBreak = LineBreak.Paragraph)

private fun TextStyle.applyTextDirection(): TextStyle =
    this.copy(textDirection = TextDirection.Content)
