package com.aurora.bank.core.designsystem.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.aurora.bank.core.designsystem.theme.AuroraShapeTokens
import com.aurora.bank.core.designsystem.theme.LocalAurora
import com.aurora.bank.core.designsystem.theme.Spacing

@Composable
fun AuroraCard(
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null,
    contentPadding: PaddingValues = PaddingValues(Spacing.l),
    content: @Composable ColumnScope.() -> Unit,
) {
    val color = LocalAurora.current.cardSurface
    val border = BorderStroke(CARD_BORDER, color = LocalAurora.current.cardOutline)
    val shape = MaterialTheme.shapes.large
    val contentColor = MaterialTheme.colorScheme.onSurface
    if (onClick != null) {
        Surface(
            onClick = onClick,
            modifier = modifier,
            color = color,
            contentColor = contentColor,
            shape = shape,
            border = border,
        ) {
            Column(modifier = Modifier.padding(contentPadding), content = content)
        }
    } else {
        Surface(
            modifier = modifier,
            color = color,
            contentColor = contentColor,
            shape = shape,
            border = border,
        ) {
            Column(modifier = Modifier.padding(contentPadding), content = content)
        }
    }
}

@Composable
fun AuroraBadge(
    label: String,
    modifier: Modifier = Modifier,
    tone: BadgeTone = BadgeTone.Default,
) {
    Surface(
        modifier = modifier,
        shape = AuroraShapeTokens.full,
        color = when (tone) {
            BadgeTone.Default -> MaterialTheme.colorScheme.secondaryContainer
            BadgeTone.Accent -> MaterialTheme.colorScheme.tertiaryContainer
        },
        contentColor = when (tone) {
            BadgeTone.Default -> MaterialTheme.colorScheme.onSecondaryContainer
            BadgeTone.Accent -> MaterialTheme.colorScheme.onTertiaryContainer
        },
    ) {
        Row {
            Text(
                text = label,
                style = MaterialTheme.typography.labelLarge,
                modifier = Modifier.padding(horizontal = Spacing.s, vertical = SPACING_BADGE_V),
            )
        }
    }
}

enum class BadgeTone {
    Default,
    Accent,
}

private val CARD_BORDER = 1.dp
private val SPACING_BADGE_V = 2.dp
