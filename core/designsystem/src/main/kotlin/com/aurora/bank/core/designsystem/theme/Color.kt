package com.aurora.bank.core.designsystem.theme

import android.graphics.BlendMode
import android.graphics.ComposeShader
import android.graphics.Matrix
import android.graphics.PorterDuff
import android.os.Build
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RadialGradientShader
import androidx.compose.ui.graphics.Shader
import androidx.compose.ui.graphics.ShaderBrush

private val LightPrimary = Color(0xFF006B5F)
private val LightOnPrimary = Color(0xFFFFFFFF)
private val LightPrimaryContainer = Color(0xFF9EF2E0)
private val LightOnPrimaryContainer = Color(0xFF00201B)
private val LightSecondary = Color(0xFF4A635D)
private val LightOnSecondary = Color(0xFFFFFFFF)
private val LightSecondaryContainer = Color(0xFFCCE8E0)
private val LightOnSecondaryContainer = Color(0xFF062019)
private val LightTertiary = Color(0xFF5D5A9D)
private val LightOnTertiary = Color(0xFFFFFFFF)
private val LightTertiaryContainer = Color(0xFFE4DFFF)
private val LightOnTertiaryContainer = Color(0xFF191152)
private val LightError = Color(0xFFBA1A1A)
private val LightOnError = Color(0xFFFFFFFF)
private val LightErrorContainer = Color(0xFFFFDAD6)
private val LightOnErrorContainer = Color(0xFF410002)
private val LightSurface = Color(0xFFF8FAF8)
private val LightOnSurface = Color(0xFF191C1B)
private val LightSurfaceVariant = Color(0xFFDBE5E1)
private val LightOnSurfaceVariant = Color(0xFF3F4946)
private val LightSurfaceContainerLowest = Color(0xFFFFFFFF)
private val LightSurfaceContainerLow = Color(0xFFF2F5F3)
private val LightSurfaceContainer = Color(0xFFEBF1EE)
private val LightSurfaceContainerHigh = Color(0xFFE5EBE8)
private val LightSurfaceContainerHighest = Color(0xFFDFE5E2)
private val LightOutline = Color(0xFF6F7975)
private val LightOutlineVariant = Color(0xFFBEC9C4)

// ----------------------------------------------------------------- dark ----
private val DarkPrimary = Color(0xFF57DBC0)
private val DarkOnPrimary = Color(0xFF00382F)
private val DarkPrimaryContainer = Color(0xFF005045)
private val DarkOnPrimaryContainer = Color(0xFF9EF2E0)
private val DarkSecondary = Color(0xFFB0CCC3)
private val DarkOnSecondary = Color(0xFF1C3530)
private val DarkSecondaryContainer = Color(0xFF334B45)
private val DarkOnSecondaryContainer = Color(0xFFCCE8E0)
private val DarkTertiary = Color(0xFFC7BFFF)
private val DarkOnTertiary = Color(0xFF2E2565)
private val DarkTertiaryContainer = Color(0xFF454084)
private val DarkOnTertiaryContainer = Color(0xFFE4DFFF)
private val DarkError = Color(0xFFFFB4AB)
private val DarkOnError = Color(0xFF690005)
private val DarkErrorContainer = Color(0xFF93000A)
private val DarkOnErrorContainer = Color(0xFFFFDAD6)
private val DarkSurface = Color(0xFF101413)
private val DarkOnSurface = Color(0xFFDEE4E0)
private val DarkSurfaceVariant = Color(0xFF3F4946)
private val DarkOnSurfaceVariant = Color(0xFFBEC9C4)
private val DarkSurfaceContainerLowest = Color(0xFF0B0F0E)
private val DarkSurfaceContainerLow = Color(0xFF181C1B)
private val DarkSurfaceContainer = Color(0xFF1C201F)
private val DarkSurfaceContainerHigh = Color(0xFF262B29)
private val DarkSurfaceContainerHighest = Color(0xFF313634)
private val DarkOutline = Color(0xFF899390)
private val DarkOutlineVariant = Color(0xFF3F4946)

internal val AuroraLightColorScheme = lightColorScheme(
    primary = LightPrimary,
    onPrimary = LightOnPrimary,
    primaryContainer = LightPrimaryContainer,
    onPrimaryContainer = LightOnPrimaryContainer,
    secondary = LightSecondary,
    onSecondary = LightOnSecondary,
    secondaryContainer = LightSecondaryContainer,
    onSecondaryContainer = LightOnSecondaryContainer,
    tertiary = LightTertiary,
    onTertiary = LightOnTertiary,
    tertiaryContainer = LightTertiaryContainer,
    onTertiaryContainer = LightOnTertiaryContainer,
    error = LightError,
    onError = LightOnError,
    errorContainer = LightErrorContainer,
    onErrorContainer = LightOnErrorContainer,
    surface = LightSurface,
    onSurface = LightOnSurface,
    surfaceVariant = LightSurfaceVariant,
    onSurfaceVariant = LightOnSurfaceVariant,
    surfaceContainerLowest = LightSurfaceContainerLowest,
    surfaceContainerLow = LightSurfaceContainerLow,
    surfaceContainer = LightSurfaceContainer,
    surfaceContainerHigh = LightSurfaceContainerHigh,
    surfaceContainerHighest = LightSurfaceContainerHighest,
    outline = LightOutline,
    outlineVariant = LightOutlineVariant,
)

internal val AuroraDarkColorScheme = darkColorScheme(
    primary = DarkPrimary,
    onPrimary = DarkOnPrimary,
    primaryContainer = DarkPrimaryContainer,
    onPrimaryContainer = DarkOnPrimaryContainer,
    secondary = DarkSecondary,
    onSecondary = DarkOnSecondary,
    secondaryContainer = DarkSecondaryContainer,
    onSecondaryContainer = DarkOnSecondaryContainer,
    tertiary = DarkTertiary,
    onTertiary = DarkOnTertiary,
    tertiaryContainer = DarkTertiaryContainer,
    onTertiaryContainer = DarkOnTertiaryContainer,
    error = DarkError,
    onError = DarkOnError,
    errorContainer = DarkErrorContainer,
    onErrorContainer = DarkOnErrorContainer,
    surface = DarkSurface,
    onSurface = DarkOnSurface,
    surfaceVariant = DarkSurfaceVariant,
    onSurfaceVariant = DarkOnSurfaceVariant,
    surfaceContainerLowest = DarkSurfaceContainerLowest,
    surfaceContainerLow = DarkSurfaceContainerLow,
    surfaceContainer = DarkSurfaceContainer,
    surfaceContainerHigh = DarkSurfaceContainerHigh,
    surfaceContainerHighest = DarkSurfaceContainerHighest,
    outline = DarkOutline,
    outlineVariant = DarkOutlineVariant,
)

@Immutable
data class AuroraExtras(
    val success: Color,
    val onSuccess: Color,
    val successContainer: Color,
    val onSuccessContainer: Color,
    val warning: Color,
    val onWarning: Color,
    val warningContainer: Color,
    val onWarningContainer: Color,
    val info: Color,
    val onInfo: Color,
    val infoContainer: Color,
    val onInfoContainer: Color,
    val cardSurface: Color,
    val cardOutline: Color,
    val auroraGradient: Brush,
    val auroraGradientDeep: Brush,
    val auroraWash: Brush,
)

private val AuroraGradient = Brush.linearGradient(
    0.0f to Color(0xFF006B5F),
    0.55f to Color(0xFF2E6E8E),
    1.0f to Color(0xFF5D5A9D),
)

private val AuroraGradientDeep = Brush.linearGradient(
    0.0f to Color(0xFF00382F),
    0.55f to Color(0xFF1C2A4A),
    1.0f to Color(0xFF2E2565),
)

private class AuroraWashBrush(private val mint: Color, private val purple: Color) : ShaderBrush() {
    override fun createShader(size: Size): Shader {
        fun radial(color: Color, cx: Float, cy: Float, rx: Float, ry: Float, fade: Float): Shader =
            RadialGradientShader(
                center = Offset(cx, cy),
                radius = rx,
                colors = listOf(color, Color.Transparent),
                colorStops = listOf(0f, fade),
            ).apply {
                setLocalMatrix(
                    Matrix().apply { postScale(1f, ry / rx, cx, cy) },
                )
            }

        val mintShader = radial(
            color = mint,
            cx = size.width * 0.88f,
            cy = -size.height * 0.12f,
            rx = size.width * 1.30f,
            ry = size.height * 0.70f,
            fade = 0.58f,
        )
        val purpleShader = radial(
            color = purple,
            cx = size.width * 0.06f,
            cy = -size.height * 0.16f,
            rx = size.width * 1.20f,
            ry = size.height * 0.70f,
            fade = 0.55f,
        )
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            ComposeShader(mintShader, purpleShader, BlendMode.SRC_OVER)
        } else {
            @Suppress("DEPRECATION")
            ComposeShader(mintShader, purpleShader, PorterDuff.Mode.SRC_OVER)
        }
    }
}

private val LightAuroraWash: Brush = AuroraWashBrush(
    mint = Color(0xFF57DBC0).copy(alpha = 0.30f),
    purple = Color(0xFF5D5A9D).copy(alpha = 0.24f),
)

private val DarkAuroraWash: Brush = AuroraWashBrush(
    mint = Color(0xFF57DBC0).copy(alpha = 0.20f),
    purple = Color(0xFFC7BFFF).copy(alpha = 0.16f),
)

internal val LightAuroraExtras = AuroraExtras(
    success = Color(0xFF1B7A45),
    onSuccess = Color(0xFFFFFFFF),
    successContainer = Color(0xFFA5F2C4),
    onSuccessContainer = Color(0xFF00210E),
    warning = Color(0xFF7A5900),
    onWarning = Color(0xFFFFFFFF),
    warningContainer = Color(0xFFFFDF9E),
    onWarningContainer = Color(0xFF261A00),
    info = Color(0xFF00639C),
    onInfo = Color(0xFFFFFFFF),
    infoContainer = Color(0xFFCFE5FF),
    onInfoContainer = Color(0xFF001D33),
    cardSurface = Color(0xFFFFFFFF),
    cardOutline = Color(0xFFDFE5E2),
    auroraGradient = AuroraGradient,
    auroraGradientDeep = AuroraGradientDeep,
    auroraWash = LightAuroraWash,
)

internal val DarkAuroraExtras = AuroraExtras(
    success = Color(0xFF8AD6A6),
    onSuccess = Color(0xFF003919),
    successContainer = Color(0xFF005229),
    onSuccessContainer = Color(0xFFA5F2C4),
    warning = Color(0xFFEEC148),
    onWarning = Color(0xFF3F2E00),
    warningContainer = Color(0xFF5B4300),
    onWarningContainer = Color(0xFFFFDF9E),
    info = Color(0xFF9BCBFF),
    onInfo = Color(0xFF003355),
    infoContainer = Color(0xFF004A78),
    onInfoContainer = Color(0xFFCFE5FF),
    cardSurface = Color(0xFF181C1B),
    cardOutline = Color(0xFF262B29),
    auroraGradient = AuroraGradient,
    auroraGradientDeep = AuroraGradientDeep,
    auroraWash = DarkAuroraWash,
)

val LocalAurora = staticCompositionLocalOf<AuroraExtras> {
    error("AuroraExtras requested outside AuroraTheme — wrap the content in AuroraTheme { }")
}
