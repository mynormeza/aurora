package com.aurora.bank.core.designsystem.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontVariation
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.aurora.bank.core.designsystem.R

private val Manrope = FontFamily(
    Font(R.font.manrope_variable, FontWeight.Normal, variationSettings = weight(400)),
    Font(R.font.manrope_variable, FontWeight.Medium, variationSettings = weight(500)),
    Font(R.font.manrope_variable, FontWeight.SemiBold, variationSettings = weight(600)),
    Font(R.font.manrope_variable, FontWeight.Bold, variationSettings = weight(700)),
    Font(R.font.manrope_variable, FontWeight.ExtraBold, variationSettings = weight(800)),
)

private fun weight(value: Int) = FontVariation.Settings(FontVariation.weight(value))

private const val TABULAR_FIGURES = "tnum"

val AuroraTypography = Typography(
    displayMedium = TextStyle(
        fontFamily = Manrope,
        fontSize = 45.sp,
        lineHeight = 52.sp,
        fontWeight = FontWeight.ExtraBold,
        letterSpacing = (-0.02).em,
    ),
    headlineLarge = TextStyle(
        fontFamily = Manrope,
        fontSize = 32.sp,
        lineHeight = 40.sp,
        fontWeight = FontWeight.ExtraBold,
        letterSpacing = (-0.015).em,
    ),
    headlineSmall = TextStyle(
        fontFamily = Manrope,
        fontSize = 24.sp,
        lineHeight = 32.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = (-0.01).em,
    ),
    titleLarge = TextStyle(
        fontFamily = Manrope,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = (-0.005).em,
    ),
    titleMedium = TextStyle(
        fontFamily = Manrope,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        fontWeight = FontWeight.Bold,
    ),
    bodyLarge = TextStyle(
        fontFamily = Manrope,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        fontWeight = FontWeight.Medium,
    ),
    bodyMedium = TextStyle(
        fontFamily = Manrope,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        fontWeight = FontWeight.Medium,
    ),
    bodySmall = TextStyle(
        fontFamily = Manrope,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.005.em,
    ),
    labelLarge = TextStyle(
        fontFamily = Manrope,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.01.em,
    ),
)

@Immutable
data class AuroraAmountStyles(
    val amountExtraLarge: TextStyle,
    val amountMedium: TextStyle,
    val amountSmall: TextStyle,
)

internal val DefaultAmountStyles = AuroraAmountStyles(
    amountExtraLarge = TextStyle(
        fontFamily = Manrope,
        fontSize = 40.sp,
        lineHeight = 46.sp,
        fontWeight = FontWeight.ExtraBold,
        fontFeatureSettings = TABULAR_FIGURES,
    ),
    amountMedium = TextStyle(
        fontFamily = Manrope,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        fontWeight = FontWeight.Bold,
        fontFeatureSettings = TABULAR_FIGURES,
    ),
    amountSmall = TextStyle(
        fontFamily = Manrope,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        fontWeight = FontWeight.Bold,
        fontFeatureSettings = TABULAR_FIGURES,
    ),
)

val LocalAuroraAmountStyles = staticCompositionLocalOf { DefaultAmountStyles }
