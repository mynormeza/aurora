package com.aurora.bank.core.designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
fun AuroraTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalAurora provides if (darkTheme) DarkAuroraExtras else LightAuroraExtras,
        LocalAuroraAmountStyles provides DefaultAmountStyles,
    ) {
        MaterialTheme(
            colorScheme = if (darkTheme) AuroraDarkColorScheme else AuroraLightColorScheme,
            typography = AuroraTypography,
            shapes = AuroraShapes,
            content = content,
        )
    }
}
