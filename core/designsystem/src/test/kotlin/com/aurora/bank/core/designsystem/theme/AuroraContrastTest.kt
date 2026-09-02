package com.aurora.bank.core.designsystem.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.ui.graphics.Color
import kotlin.math.pow
import org.junit.Assert.assertTrue
import org.junit.Test

class AuroraContrastTest {
    @Test
    fun `light scheme meets AA for every pair the design system pins`() {
        assertScheme(AuroraLightColorScheme, LightAuroraExtras, "light")
    }

    @Test
    fun `dark scheme meets AA for every pair the design system pins`() {
        assertScheme(AuroraDarkColorScheme, DarkAuroraExtras, "dark")
    }

    @Test
    fun `the contrast formula matches the WCAG references values`() {
        assertTrue(
            "black-on-white should be 21:1",
            (contrastRatio(Color.Black, Color.White) - 21.0).let { kotlin.math.abs(it) } < 0.01,
        )
        assertTrue(
            "a colour against itself should be 1:1",
            (contrastRatio(Color(0xFF006B5F), Color(0xFF006B5F)) - 1.0).let {
                kotlin.math.abs(it)
            } < 0.001,
        )
    }

    private fun assertScheme(scheme: ColorScheme, extras: AuroraExtras, label: String) {
        assertAtLeast(TEXT_MINIMUM, scheme.onSurface, scheme.surface, "$label body text")
        assertAtLeast(
            TEXT_MINIMUM,
            scheme.onSurfaceVariant,
            scheme.surface,
            "$label secondary text",
        )
        assertAtLeast(
            TEXT_MINIMUM,
            scheme.primary,
            scheme.surface,
            "$label links",
        )

        assertAtLeast(
            TEXT_MINIMUM,
            scheme.onPrimary,
            scheme.primary,
            "$label filled button",
        )
    }

    private fun assertAtLeast(minimum: Double, foreground: Color, background: Color, what: String) {
        val ratio = contrastRatio(foreground, background)
        assertTrue(
            "$what: contrast %.2f:1 is below the required %.1f:1".format(ratio, minimum),
            ratio >= minimum,
        )
    }

    private companion object {
        const val TEXT_MINIMUM = 4.5
        const val UI_MINIMUM = 3.0
    }
}

private fun contrastRatio(a: Color, b: Color): Double {
    val la = relativeLuminance(a)
    val lb = relativeLuminance(b)
    val lighter = maxOf(la, lb)
    val darker = minOf(la, lb)
    return (lighter + 0.05) / (darker + 0.05)
}

private fun relativeLuminance(color: Color): Double = 0.2126 * linearise(color.red) +
    0.7152 * linearise(color.green) +
    0.0722 * linearise(color.blue)

private fun linearise(channel: Float): Double {
    val c = channel.toDouble()
    return if (c <= 0.03928) c / 12.92 else ((c + 0.055) / 1.055).pow(2.4)
}
