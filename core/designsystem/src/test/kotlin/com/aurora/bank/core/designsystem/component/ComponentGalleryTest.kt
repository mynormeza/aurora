package com.aurora.bank.core.designsystem.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import com.android.ide.common.rendering.api.SessionParams
import com.aurora.bank.core.designsystem.icon.AuroraIcons
import com.aurora.bank.core.designsystem.theme.AuroraSizes
import com.aurora.bank.core.designsystem.theme.AuroraTheme
import com.aurora.bank.core.designsystem.theme.Spacing
import org.junit.Rule
import org.junit.Test

class ComponentGalleryTest {
    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = DeviceConfig.PIXEL_5,
        renderingMode = SessionParams.RenderingMode.SHRINK,
        maxPercentDifference = 0.0,
    )

    private fun gallery(content: @Composable () -> Unit) {
        listOf("light" to false, "dark" to true).forEach { (name, dark) ->
            paparazzi.snapshot(name = name) {
                AuroraTheme(darkTheme = dark) {
                    Surface {
                        Column(
                            modifier = Modifier
                                .width(GALLERY_WIDTH)
                                .padding(Spacing.l),
                            verticalArrangement = Arrangement.spacedBy(Spacing.m),
                        ) {
                            content()
                        }
                    }
                }
            }
        }
    }

    @Test
    fun buttons() = gallery {
        AuroraButton(
            text = "Send money",
            onClick = {},
        )
        AuroraOutlinedButton(
            text = "View Statement",
            onClick = {},
        )
        AuroraTextButton(
            text = "Not now",
            onClick = {},
        )
        AuroraButton(
            text = "Send money",
            enabled = false,
            onClick = {},
        )
        AuroraButton(
            text = "Send money",
            loadingText = "Sending...",
            loading = true,
            onClick = {},
        )
    }

    @Test
    fun skeletons() = gallery {
        AuroraTransactionRowSkeleton(reduceMotion = true)
        AuroraTransactionRowSkeleton(reduceMotion = true)
        AuroraSkeletonBlock(reduceMotion = true)
        Row(horizontalArrangement = Arrangement.spacedBy(Spacing.xl)) {
            AuroraSkeletonCircle(diameter = AuroraSizes.quickActionTile, reducedMotion = true)
            AuroraSkeletonCircle(diameter = AuroraSizes.quickActionTile, reducedMotion = true)
            AuroraSkeletonCircle(diameter = AuroraSizes.quickActionTile, reducedMotion = true)
        }
    }

    @Test
    fun textFields() = gallery {
        AuroraTextField(
            value = "Lucía Fernández",
            onValueChange = {},
            label = "Full name",
            supportingText = "As it appears on your ID",
        )
        AuroraTextField(
            value = "ES91 2100 0418 45",
            onValueChange = {},
            label = "IBAN",
            numeric = true,
            errorText = "Check the number — Spanish IBANs have 24 characters " +
                "(you've entered 16)",
        )
        AuroraTextField(
            value = "lucia@example.com",
            onValueChange = {},
            label = "Email (from your ID record)",
            enabled = false,
        )
    }

    @Test
    fun appBars() = gallery {
        AuroraTopAppBar(
            title = "Cuenta Corriente",
            onBack = {},
            backIcon = AuroraIcons.back,
            backContentDescription = "Back",
            actions = { AuroraIconAction(AuroraIcons.download, "Download", {}) },
        )
    }
}

private val GALLERY_WIDTH = 412.dp
